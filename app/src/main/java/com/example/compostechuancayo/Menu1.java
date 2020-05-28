package com.example.compostechuancayo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Menu1 extends AppCompatActivity {

    ImageButton compost1,compost2,compost3;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        compost1 = (ImageButton) findViewById(R.id.compost1);

        compost1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Menu1.this, Compost1.class);
                startActivity(intentLoadNewActivity);
            }

        });
        compost2 = (ImageButton) findViewById(R.id.compost2);

        compost2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Menu1.this, Compost2.class);
                startActivity(intentLoadNewActivity);
            }
        });

        compost3 = (ImageButton) findViewById(R.id.compost3);

        compost3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Menu1.this, Compost3.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }

}
