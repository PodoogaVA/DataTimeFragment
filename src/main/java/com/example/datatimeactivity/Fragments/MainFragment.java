package com.example.datatimeactivity.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.datatimeactivity.Activities.First;
import com.example.datatimeactivity.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainFragment extends Fragment {
    Button btn1;
    TextView txt1;
    TextView txt2;
    // Текущее время
    Date currentDate = new Date();
    // Форматирование времени как "день.месяц.год"
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
    String dateText = dateFormat.format(currentDate);
    // Форматирование времени как "часы:минуты:секунды"
    DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    String timeText = timeFormat.format(currentDate);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        btn1 = v.findViewById(R.id.mybtn1);
        txt1 = v.findViewById(R.id.mytxt1);
        txt2 = v.findViewById(R.id.mytxt2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(" ");
                txt2.setText("Дата: " + dateText + ", время: " + timeText);
                Intent sw = new Intent(getContext(), First.class);
                sw.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(sw);
            }
        });
        return v;
    }
}