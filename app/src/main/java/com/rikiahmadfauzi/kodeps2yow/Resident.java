package com.rikiahmadfauzi.kodeps2yow;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Resident extends AppCompatActivity {
    ImageView back;

     /*
    Nama : Riki Ahmad Fauzi
    Kelas : IF4
    Nim : 10117153
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.residentevil);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent a = new Intent(Resident.this, Kode_Adventure.class);
                startActivity(a);
            }
        });
    }
}
