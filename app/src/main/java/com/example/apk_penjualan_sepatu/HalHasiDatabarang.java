package com.example.apk_penjualan_sepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HalHasiDatabarang extends AppCompatActivity {

    //deklarasi variable
    TextView kode1, nabar, jenis1, stok1, warna1, ukuran1, harga1;
    Button simpan, kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_hasi_databarang);

        //pemanggilan id
        kode1 = (TextView) findViewById(R.id.tv_kode);
        nabar = (TextView) findViewById(R.id.tv_nama);
        jenis1 = (TextView) findViewById(R.id.tv_jenis);
        stok1 = (TextView) findViewById(R.id.tv_stok);
        warna1 = (TextView) findViewById(R.id.tv_warna);
        ukuran1 = (TextView) findViewById(R.id.tv_ukuran);
        harga1 = (TextView) findViewById(R.id.tv_harga);
        simpan = (Button) findViewById(R.id.btn_simpan);
        kembali = (Button) findViewById(R.id.btn_kembali);

        //fungsi klik
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(HalHasiDatabarang.this,Home.class);
                startActivity(kembali);
            }
        });

        //parcel
        String kodep = getIntent().getStringExtra("akode");
        kode1.setText(kodep);
        String nabarp = getIntent().getStringExtra("anamabarang");
        nabar.setText(nabarp);
        String jenisp = getIntent().getStringExtra("ajenis");
        jenis1.setText(jenisp);
        String stokp = getIntent().getStringExtra("astok");
        stok1.setText(stokp);
        String warnap = getIntent().getStringExtra("awarna");
        warna1.setText(warnap);
        String ukuranp = getIntent().getStringExtra("aukuran");
        ukuran1.setText(ukuranp);
        String hargap = getIntent().getStringExtra("aharga");
        harga1.setText(hargap);

    }
}