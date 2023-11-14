package com.example.chartassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.btnChart);

        b1.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),ScatterChartDemo.class);
            startActivity(intent);
        });
    }
}