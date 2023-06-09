package com.example.heranacalculator;

import static com.example.heranacalculator.R.id.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ui);

        Button buttoncal;

        buttoncal=findViewById(R.id.calcu);
        buttoncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainUI.this, Calculator.class);
                startActivity(intent);
            }
        });

        Button buttonlist;

       buttonlist=findViewById(R.id.list);
        buttonlist.setOnClickListener(v -> {

            Intent intent = new Intent(MainUI.this, ToDoList.class);
            startActivity(intent);
        });
    }
}