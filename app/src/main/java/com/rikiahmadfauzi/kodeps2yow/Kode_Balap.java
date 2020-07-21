package com.rikiahmadfauzi.kodeps2yow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Kode_Balap extends AppCompatActivity {
    ImageView back;
    LinearLayout NeedForSpeedCarbon, NeedForSpeedMostWanted, NeedForSpeedProStreet,
            Bornout, RumbleRacing, Downhill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_balap);

        NeedForSpeedCarbon = findViewById(R.id.needforspeedcarbon);
        NeedForSpeedMostWanted = findViewById(R.id.needforspeedmostwanted);
        NeedForSpeedProStreet = findViewById(R.id.needforspeedprostreet);
        Bornout = findViewById(R.id.bornout3);
        RumbleRacing = findViewById(R.id.rumbleracing);
        Downhill = findViewById(R.id.downhill);
        back = findViewById(R.id.back);

        //untuk pindah aktiviti
        NeedForSpeedCarbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Balap.this, NeedForSpeedCarbon.class);
                startActivity(a);
            }
        });
        NeedForSpeedMostWanted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Balap.this, NeedForSpeedMostWanted.class);
                startActivity(a);
            }
        });
        NeedForSpeedProStreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Balap.this, NeedForSpeedProStreet.class);
                startActivity(a);
            }
        });
        Bornout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Balap.this, Bornout.class);
                startActivity(a);
            }
        });
        RumbleRacing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Balap.this, RumbleRacing.class);
                startActivity(a);
            }
        });
        Downhill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Balap.this, Downhill.class);
                startActivity(a);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Balap.this, Menu_Game.class);
                startActivity(a);
            }
        });
    }
}