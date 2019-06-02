package com.netfanely.mime2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button siguiente3;
    Button siguiente4;
    Button siguiente5;
    Button siguiente6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        siguiente3 =(Button)findViewById(R.id.btn3);
        siguiente4 =(Button)findViewById(R.id.btn4);
        siguiente5 =(Button)findViewById(R.id.btn5);
        siguiente6 =(Button)findViewById(R.id.btn6);

        siguiente3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente3 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(siguiente3);
            }
        });

        siguiente4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente4 = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(siguiente4);
            }
        });

        siguiente5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente5 = new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(siguiente5);
            }
        });
        siguiente6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente6 = new Intent(Main2Activity.this,Main6Activity.class);
                startActivity(siguiente6);
            }
        });
    }
}
