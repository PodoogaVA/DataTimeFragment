package com.example.datatimeactivity.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.datatimeactivity.Fragments.SecondFragment;
import com.example.datatimeactivity.R;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String str = getIntent().getExtras().getString("msg",null);
        if(str != null){
            ((SecondFragment)getSupportFragmentManager().findFragmentById(R.id.id)).setText(str);
        }
    }
}