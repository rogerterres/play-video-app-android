package com.grasset.roger.playvideotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button imageButton1 = (Button) findViewById(R.id.b1);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MenuActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }
        });

        Button imageButton2 = (Button) findViewById(R.id.b2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MenuActivity.this, VideoActivity.class);
                startActivity(homeIntent);
            }
        });

        Button imageButton3 = (Button) findViewById(R.id.b3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }
}
