package com.example.apk_penjualan_sepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class HalInputDataCustomer extends AppCompatActivity {

    //deklarasi variable
    ImageView back3;
    EditText no, namacus, alamat, tlp;
    Button proses2, reset2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_input_data_customer);

        //pemanggilan id
        back3 =(ImageView) findViewById(R.id.iv_back3);
        no = (EditText) findViewById(R.id.et_no);
        namacus = (EditText) findViewById(R.id.et_namacus);
        alamat = (EditText) findViewById(R.id.et_alamat);
        tlp = (EditText) findViewById(R.id.et_tlp);
        proses2 = (Button) findViewById(R.id.btn_proses2);
        reset2 = (Button) findViewById(R.id.btn_reset2);

        //fungsi klik & parcel
        proses2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahdatacus = new Intent(HalInputDataCustomer.this,HalDataCustomer.class);
                pindahdatacus.putExtra("noa", no.getText().toString());
                pindahdatacus.putExtra("namacusa", namacus.getText().toString());
                pindahdatacus.putExtra("alamata", alamat.getText().toString());
                pindahdatacus.putExtra("tlpa", tlp.getText().toString());
                startActivity(pindahdatacus);
            }
        });

        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no.setText("");
                namacus.setText("");
                alamat.setText("");
                tlp.setText("");
            }
        });
    }
}