package com.example.compostechuancayo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.widget.TextView;

public class Compost3 extends AppCompatActivity {
    TextView textViewvolumen,textViewtemperatura,textViewhumedad;
    DatabaseReference mDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compost3);

        textViewvolumen = (TextView) findViewById(R.id.vol3);
        textViewtemperatura = (TextView) findViewById(R.id.tem3);
        textViewhumedad = (TextView) findViewById(R.id.hum3);
        mDataBase = FirebaseDatabase.getInstance().getReference();

        mDataBase.child("Compost3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String volumen = dataSnapshot.child("volumen").getValue().toString();
                textViewvolumen.setText(volumen+"%");
                String temperatura = dataSnapshot.child("temperatura").getValue().toString();
                textViewtemperatura.setText(temperatura+"º");
                String humedad = dataSnapshot.child("humedad").getValue().toString();
                textViewhumedad.setText(humedad+"%");

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
