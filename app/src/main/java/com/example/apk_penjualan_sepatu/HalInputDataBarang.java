package com.example.apk_penjualan_sepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class HalInputDataBarang extends AppCompatActivity {

    //deklarasi variable
    ImageView back1;
    EditText kode, namabarang, jenis, stok, warna, ukuran, harga;
    Button proses1, reset1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_input_data_barang);

        //pemanggilan id
        back1 = (ImageView) findViewById(R.id.iv_back1);
        kode = (EditText) findViewById(R.id.et_kdbarang);
        namabarang = (EditText) findViewById(R.id.et_nabarang);
        jenis = (EditText) findViewById(R.id.et_jenisbarang);
        stok = (EditText) findViewById(R.id.et_stok);
        warna = (EditText) findViewById(R.id.et_warna);
        ukuran = (EditText) findViewById(R.id.et_ukuran);
        harga = (EditText) findViewById(R.id.et_harga);

        //fungsi klik, intent, parcel
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kode.setText("");
                namabarang.setText("");
                jenis.setText("");
                stok.setText("");
                warna.setText("");
                ukuran.setText("");
                harga.setText("");
            }
        });

        proses1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahdatabarang = new Intent(HalInputDataBarang.this,HalHasiDatabarang.class);
                pindahdatabarang.putExtra("akode", kode.getText().toString());
                pindahdatabarang.putExtra("anamabarang", namabarang.getText().toString());
                pindahdatabarang.putExtra("ajenis", jenis.getText().toString());
                pindahdatabarang.putExtra("astok", stok.getText().toString());
                pindahdatabarang.putExtra("awarna", warna.getText().toString());
                pindahdatabarang.putExtra("aukuran", ukuran.getText().toString());
                pindahdatabarang.putExtra("aharga", harga.getText().toString());
                startActivity(pindahdatabarang);
            }
        });
    }
}