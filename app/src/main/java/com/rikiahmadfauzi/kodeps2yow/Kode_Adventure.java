package com.rikiahmadfauzi.kodeps2yow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Kode_Adventure extends AppCompatActivity {
    ImageView back;
    LinearLayout Gta,mortal,bully,godofwar,resident4,lego;

     /*
    Nama : Riki Ahmad Fauzi
    Kelas : IF4
    Nim : 10117153
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_adventure);

        Gta = findViewById(R.id.gtasandreas);
        mortal = findViewById(R.id.mortal);
        bully = findViewById(R.id.bully);
        godofwar = findViewById(R.id.godofwar);
        resident4 = findViewById(R.id.resident);
        lego = findViewById(R.id.lego);
        back = findViewById(R.id.back);

        //untuk pindah aktiviti
        Gta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Adventure.this, Gta.class);
                startActivity(a);
            }
        });
        mortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Adventure.this, Mortal.class);
                startActivity(a);
            }
        });
        bully.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Adventure.this, Bully.class);
                startActivity(a);
            }
        });
        godofwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Adventure.this, GodOfWar.class);
                startActivity(a);
            }
        });
        resident4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Adventure.this, Resident.class);
                startActivity(a);
            }
        });
        lego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Adventure.this, Lego.class);
                startActivity(a);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Adventure.this, Menu_Game.class);
                startActivity(a);
            }
        });
    }
}