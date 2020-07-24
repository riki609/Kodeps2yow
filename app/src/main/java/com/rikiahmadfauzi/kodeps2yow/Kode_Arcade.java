package com.rikiahmadfauzi.kodeps2yow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Kode_Arcade extends AppCompatActivity {
    ImageView back;
    LinearLayout tekken,nfsunderground,devil,ultimate,teenage,ben10;

     /*
    Nama : Riki Ahmad Fauzi
    Kelas : IF4
    Nim : 10117153
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_arcade);

        tekken = findViewById(R.id.tekken);
        nfsunderground = findViewById(R.id.nfsunderground);
        devil = findViewById(R.id.devil);
        ultimate = findViewById(R.id.ultimate);
        teenage = findViewById(R.id.teenage);
        ben10 = findViewById(R.id.ben10);
        back = findViewById(R.id.back);

        //untuk pindah aktiviti
        tekken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Arcade.this, Tekken5.class);
                startActivity(a);
            }
        });
        nfsunderground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Arcade.this, Nfsunderground.class);
                startActivity(a);
            }
        });
        devil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Arcade.this, Devil.class);
                startActivity(a);
            }
        });
        ultimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Arcade.this, Ultimatespiderman.class);
                startActivity(a);
            }
        });
        teenage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Arcade.this, Teenageninja.class);
                startActivity(a);
            }
        });
        ben10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Arcade.this, Ben10.class);
                startActivity(a);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Kode_Arcade.this, Menu_Game.class);
                startActivity(a);
            }
        });
    }
}