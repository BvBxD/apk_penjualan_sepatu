package com.example.apk_penjualan_sepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class HalamanLogin extends AppCompatActivity {

    //deklarasi variable
    EditText username, password;
    Button reset, proses;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login);

        //pemnggilan id
        username = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password);
        proses = (Button) findViewById(R.id.btn_proses);
        reset = (Button) findViewById(R.id.btn_reset);
        back = (ImageView) findViewById(R.id.iv_back);

        //fungsi klik & intent
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proses1 = new Intent(HalamanLogin.this,Home.class);
                startActivity(proses1);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username.setText("");
                password.setText("");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(HalamanLogin.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}