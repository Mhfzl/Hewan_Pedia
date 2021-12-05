package com.example.meapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKelinci,btnKuda,btnMonyet,btnBiodata;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    private void inisialisasiView() {
        btnKuda = findViewById(R.id.btn_buka_ras_kuda);
        btnKelinci = findViewById(R.id.btn_buka_ras_kelinci);
        btnMonyet = findViewById(R.id.btn_buka_ras_monyet);
        btnBiodata = findViewById(R.id.btn_buka_biodata);
        btnKuda.setOnClickListener(view -> bukaGaleri("Kuda"));
        btnKelinci.setOnClickListener(view -> bukaGaleri("Kelinci"));
        btnMonyet.setOnClickListener(view -> bukaGaleri("Monyet"));
        btnBiodata.setOnClickListener(view -> bukaBiodataActivity());
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    private void bukaBiodataActivity() {
        Log.d("MAIN","Buka activity Biodata");
        Intent intent = new Intent(this, BiodataActivity.class);
        startActivity(intent);
    }

}