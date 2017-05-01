package com.example.rok.a0427;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner s1;
    SpinnerAdapter adapter;
    String []fruit = {"사과","복숭아","수박"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = (Spinner)findViewById(R.id.spinner);
        adapter = new spinneradapter(fruit,this);
        s1.setAdapter(adapter);



    }
}
