package com.example.terence.uthere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);

         findViewById(R.id.datePicker);
    }
}
