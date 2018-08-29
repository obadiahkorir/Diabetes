package com.example.obadiahkorir.diatebese;

/**
 * Created by Obadiah Korir on 7/16/2018.
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class AlarmMessage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new AlertDialog.Builder(this)
/*				.setIcon(R.drawable.clock)*/
                .setTitle("·Alarm")
                .setMessage(
                        "It is Just a Reminder"
                                + new SimpleDateFormat("yyyyÄêMMÔÂddÈÕ HHÊ±mm·ÖssÃë")
                                .format(new Date()))
                .setPositiveButton("Okey", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        AlarmMessage.this.finish();
                    }
                }).show();
    }

}