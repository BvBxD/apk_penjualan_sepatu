package com.example.apk_penjualan_sepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HalDataCustomer extends AppCompatActivity {

    //deklarasi variable
    ImageView back2;
    TextView nocus, namacustomer, alamatcus, tlpcus;
    Button simpan1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_data_customer);

        //pemanggilan id
        back2 = (ImageView) findViewById(R.id.iv_back2);
        nocus = (TextView) findViewById(R.id.tv_no);
        namacustomer = (TextView) findViewById(R.id.tv_namacus);
        alamatcus = (TextView) findViewById(R.id.tv_alamat);
        tlpcus = (TextView) findViewById(R.id.tv_tlp);
        simpan1 = (Button) findViewById(R.id.btn_simpan1);

        //fungsi klik & prcalable
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back2 = new Intent(HalDataCustomer.this,Home.class);
                startActivity(back2);
            }
        });

        String nop = getIntent().getStringExtra("noa");
        nocus.setText(nop);
        String namacusp = getIntent().getStringExtra("namacusa");
        namacustomer.setText(namacusp);
        String alamatp = getIntent().getStringExtra("alamata");
        alamatcus.setText(alamatp);
        String tlpp = getIntent().getStringExtra("tlpa");
        tlpcus.setText(tlpp);
    }
}