package com.rikiahmadfauzi.kodeps2yow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NeedForSpeedProStreet  extends AppCompatActivity {
    ImageView back;

     /*
    Nama : Riki Ahmad Fauzi
    Kelas : IF4
    Nim : 10117153
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.needforspeedprostreet);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent a = new Intent(NeedForSpeedProStreet.this, Kode_Balap.class);
                startActivity(a);
            }
        });
    }
}