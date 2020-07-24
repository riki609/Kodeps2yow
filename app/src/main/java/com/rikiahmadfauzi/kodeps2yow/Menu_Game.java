package com.rikiahmadfauzi.kodeps2yow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_Game extends AppCompatActivity {

    Button button7,button8,button9;

     /*
    Nama : Riki Ahmad Fauzi
    Kelas : IF4
    Nim : 10117153
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_game);

        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        //untuk pindah aktiviti
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Menu_Game.this, Kode_Balap.class);
                startActivity(a);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Menu_Game.this, Kode_Adventure.class);
                startActivity(a);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Menu_Game.this, Kode_Arcade.class);
                startActivity(a);
            }
        });

    }
}
