package com.example.obadiahkorir.diatebese;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener {
LinearLayout appointment,sugarlayout,learn_layout,diet_layout,weight_layout,doctor_layout,bloodlayout,medication_layout,exercise_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        appointment= (LinearLayout) findViewById(R.id.appointment);
        appointment.setOnClickListener(this);

        weight_layout= (LinearLayout) findViewById(R.id.weight_layout);
        weight_layout.setOnClickListener(this);

        learn_layout= (LinearLayout) findViewById(R.id.learn_layout);
        learn_layout.setOnClickListener(this);

        bloodlayout= (LinearLayout) findViewById(R.id.bloodlayout);
        bloodlayout.setOnClickListener(this);

        medication_layout= (LinearLayout) findViewById(R.id.medication_layout);
        medication_layout.setOnClickListener(this);

        exercise_layout= (LinearLayout) findViewById(R.id.exercise_layout);
        exercise_layout.setOnClickListener(this);

        doctor_layout= (LinearLayout) findViewById(R.id.doctor_layout);
        doctor_layout.setOnClickListener(this);

        diet_layout= (LinearLayout) findViewById(R.id.diet_layout);
        diet_layout.setOnClickListener(this);

        sugarlayout= (LinearLayout) findViewById(R.id.sugarlayout);
        sugarlayout.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    public void onClick(View v) {
        if (v == appointment) {
            AppointmentFunction();
        }
        if (v == sugarlayout) {
           SugarFunction();
        }
        if (v == learn_layout) {
            LearnFunction();
        }
        if (v == diet_layout) {
            DietFunction();
        }
        if (v == medication_layout) {
            MedicationFunction();
        }
        if (v ==  exercise_layout) {
           ExerciseFunction();
        }
        if (v ==   weight_layout) {
             WeightFunction();
        }
        if (v ==  bloodlayout) {
            BloodFunction();
        }
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(getApplicationContext(),ReminderActivity.class);
            startActivity(i);
            MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                    R.anim.push_left_out);
    }
        if (id == R.id.action_reminder) {
            Intent i = new Intent(getApplicationContext(),ReminderActivity.class);
            startActivity(i);
            MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                    R.anim.push_left_out);
        }

        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                    R.anim.push_left_out);

        } else if (id == R.id.nav_profile) {
            Intent i = new Intent(getApplicationContext(),ProfileActivity.class);
            startActivity(i);
            MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                    R.anim.push_left_out);

        } else if (id == R.id.nav_weight) {
            Intent i = new Intent(getApplicationContext(),GalleryActivity.class);
            startActivity(i);
            MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                    R.anim.push_left_out);

        } else if (id == R.id.nav_diet) {
            Intent i = new Intent(getApplicationContext(),NutritionsActivity.class);
            startActivity(i);
            MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                    R.anim.push_left_out);


        } else if (id == R.id.nav_medication) {
            Intent i = new Intent(getApplicationContext(),MedicineActivity.class);
            startActivity(i);
            MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                    R.anim.push_left_out);
        }
        else if (id == R.id.nav_exer) {
            Intent i = new Intent(getApplicationContext(),ExerciseActivity.class);
            startActivity(i);
            MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                    R.anim.push_left_out);
        } else if (id == R.id.nav_pressure) {
            Intent i = new Intent(getApplicationContext(),PressureActivity.class);
            startActivity(i);
            MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                    R.anim.push_left_out);
        }
        else if (id == R.id.nav_share) {

        }else if (id == R.id.nav_send) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @SuppressLint("NewApi")
    public void AppointmentFunction() {
        Intent i = new Intent(getApplicationContext(),AppointmentActivity.class);
        startActivity(i);
        MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                R.anim.push_left_out);
    }
    @SuppressLint("NewApi")
    public void SugarFunction() {
        Intent i = new Intent(getApplicationContext(),SugarActivity.class);
        startActivity(i);
        MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                R.anim.push_left_out);
    }
    @SuppressLint("NewApi")
    public void LearnFunction() {
        Intent i = new Intent(getApplicationContext(),LearningActivity.class);
        startActivity(i);
        MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                R.anim.push_left_out);
    }
    @SuppressLint("NewApi")
    public void MedicationFunction() {
        Intent i = new Intent(getApplicationContext(),MedicineActivity.class);
        startActivity(i);
        MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                R.anim.push_left_out);
    }
    @SuppressLint("NewApi")
    public void DietFunction() {
        Intent i = new Intent(getApplicationContext(),NutritionsActivity.class);
        startActivity(i);
        MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                R.anim.push_left_out);
    }
    @SuppressLint("NewApi")
    public void ExerciseFunction() {
        Intent i = new Intent(getApplicationContext(),ExerciseActivity.class);
        startActivity(i);
        MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                R.anim.push_left_out);
    }
    @SuppressLint("NewApi")
    public void WeightFunction() {
        Intent i = new Intent(getApplicationContext(),WeightActivity.class);
        startActivity(i);
        MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                R.anim.push_left_out);
    }
    @SuppressLint("NewApi")
    public void BloodFunction() {
        Intent i = new Intent(getApplicationContext(),PressureActivity.class);
        startActivity(i);
        MainActivity.this.overridePendingTransition(R.anim.push_left_in,
                R.anim.push_left_out);
    }
}
