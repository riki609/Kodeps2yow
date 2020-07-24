package com.rikiahmadfauzi.kodeps2yow;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ben10  extends AppCompatActivity {
    /*
    Nama : Riki Ahmad Fauzi
    Kelas : IF4
    Nim : 10117153
     */

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ben10);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ben10.this, Kode_Arcade.class);
                startActivity(a);
            }
        });
    }
}