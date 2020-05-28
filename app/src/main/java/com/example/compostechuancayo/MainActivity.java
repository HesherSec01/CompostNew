package com.example.compostechuancayo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDescarga,btnCompost,btnMonitoreo;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDescarga = (Button) findViewById(R.id.btn_descarga);
        btnDescarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://docs.google.com/uc?export=download&id=11PRwz25DCvw4O987cJSzmCXH25x8kSAO";
                Intent intent = null;
                intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);

            }
        });

        btnCompost = (Button) findViewById(R.id.btn_compost);
        btnCompost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.iquitosplay.dellatemarker");
                startActivity(launchIntent);

            }
        });

        btnMonitoreo = (Button) findViewById(R.id.btn_monitoreo);
        btnMonitoreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Menu1.class);
                startActivity(i);

            }
        });


    }
}
