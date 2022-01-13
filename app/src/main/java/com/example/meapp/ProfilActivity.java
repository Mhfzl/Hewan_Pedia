package com.example.meapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.meapp.model.Hewan;
import com.example.meapp.model.Kelinci;
import com.example.meapp.model.Kuda;
import com.example.meapp.model.Monyet;

public class ProfilActivity extends AppCompatActivity {

    Hewan hewan;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        hewan = (Hewan) intent.getSerializableExtra(DaftarHewanActivity.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(hewan);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarHewan);
    }

    private void tampilkanProfil(Hewan hewan) {
        Log.d("Profil","Menampilkan "+hewan.getJenis());
        if(hewan instanceof Kelinci){
            txJudul.setText(getString(R.string.jenis_Kelinci));
        }else if(hewan instanceof Kuda){
            txJudul.setText(getString(R.string.jenis_Kuda));
        }else if(hewan instanceof Monyet){
            txJudul.setText(getString(R.string.jenis_Monyet));
        }
        txJenis.setText(hewan.getRas());
        txAsal.setText(hewan.getAsal());
        txDeskripsi.setText(hewan.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(hewan.getDrawableRes()));
    }

}
