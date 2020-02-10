package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton set;
    private ImageButton boo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boo = (ImageButton) findViewById(R.id.book);
        boo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensyllabus();

            }

        });
        set = (ImageButton) findViewById(R.id.fucalty);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });

    }
    public void openActivity2(){
        Intent intent = new Intent(this, fucalty.class);
        startActivity(intent);

    }
    public void opensyllabus(){
        Intent intent2 = new Intent(this, syllabus.class);
        startActivity(intent2);

    }



}
