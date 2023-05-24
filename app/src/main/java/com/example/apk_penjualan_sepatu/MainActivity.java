package com.example.apk_penjualan_sepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //deklarasi variable
    Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pemanggilan id
        getStarted = (Button) findViewById(R.id.btn_get);

        //pindah halaman
        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, HalamanLogin.class);
                startActivity(pindah);
            }
        }); // sama ajaaaaaa
    }
}