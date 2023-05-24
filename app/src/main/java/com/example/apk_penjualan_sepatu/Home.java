package com.example.apk_penjualan_sepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {

    //deklarasi Variable
    Button finish;
    TextView databarang, datacustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //pemanggilan id
        finish = (Button) findViewById(R.id.btn_finish);
        databarang = (TextView) findViewById(R.id.tv_databarang);
        datacustomer = (TextView) findViewById(R.id.tv_datacustomer);

        //fungsi klik
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        databarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent databarang = new Intent(Home.this,HalInputDataBarang.class);
                startActivity(databarang);
            }
        });

        datacustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent datacustomer = new Intent(Home.this,HalDataCustomer.class);
                startActivity(datacustomer);
            }
        });
    }
}