package com.example.meapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.meapp.model.Kuda;
import com.example.meapp.model.Kelinci;
import com.example.meapp.model.Monyet;
import com.example.meapp.model.Hewan;

public class DataProvider {
    private static List<Hewan> hewans  = new ArrayList<>();

    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("Anggora","Ankara, Turki",
                "kelinci ini memiliki bulu yang lebat dan panjang. Berat kelinci ini sekitar 2-4 kg. Bulu kelinci anggora dapat tumbuh sekitar 2 cm tiap bulan. Selain sebagai kelinci hias, bulu dari tipe Anggora ini sering digunakan sebagai wool.",R.drawable.k_anggora));
        kelincis.add(new Kelinci("Lop","Belanda",
                "Keunikan kelinci Lop yaitu pada bagian telinganya. Telinga kelinci Lop menggantung dari kepala sampai ke pipi yang mulai terlihat saat kelinci berumur 2-4 bulan. Ciri-ciri lain dari kelinci Lop adalah hidungnya yang pesek.  Ukuran tubuh yaitu 12-23 cm.",R.drawable.k_lop));
        kelincis.add(new Kelinci("Flemish Giant","Argentina",
                "Kelinci Flemish Giant memiliki ciri-ciri tubuh yang besar dengan berat paling ringan yaitu 8 kg dan yang paling berat bisa mencapai 13 kg, bahkan rekor terbesar mencapai 22,23 kg dalam Guinness World Records. Panjang tubuhnya mencapai 51 cm dan panjang telinga sampai 15 cm serta kaki besar.",R.drawable.k_felmishgiant));
        kelincis.add(new Kelinci("Rex","Perancis",
                "Kelinci Rex yang sering dibudidayakan mempunyai dua jenis yaitu Rex standard an Rex mini. Rex standar memiliki berat 3,6-5 kg, sedangkan Rex mini memiliki berat 1,4-2 kg. Bulu kelinci Rex memiliki teval sekitar 1-2 cm. Warna bulu yang diakui sebagai warna standar kelinci Rex yaitu hitam, biru, castor, lynx, opal, coklat, merah, putih, chinchilla, lilac, himalayan, broken, dan tricolor.",R.drawable.k_rex));
        kelincis.add(new Kelinci("Neteherland Dwarf","Belanda",
                "Ciri-ciri kelinci ini yaitu memiliki tubuh yang pendek, kepala bulat, leher pendek. Berat kelinci Netherland Dwarf hanya mencapai 1 kg. Warna bulu kelinci ini bervariasi namun yang paling diminati yaitu kelinci dengan warna bulu putih dan mata berwarna merah.",R.drawable.k_netherlanddwarf));
        kelincis.add(new Kelinci("Himalayan","Amerika",
                "Ciri-ciri kelinci ini yaitu warna bulu yang seputih salju dan memiliki kombinasi warna polkadot hitam disekitar hidungnya, serta tambahan warna lain di sekitar telinga dan ekor. Berat badan rata-rata yaitu 2,5-4,5 kg. Untuk kelinci berukuran mini memiliki berat 1 kg saja.",R.drawable.k_himalayan));
        kelincis.add(new Kelinci("Anggora","Ankara, Turki",
                "kelinci ini memiliki bulu yang lebat dan panjang. Berat kelinci ini sekitar 2-4 kg. Bulu kelinci anggora dapat tumbuh sekitar 2 cm tiap bulan. Selain sebagai kelinci hias, bulu dari tipe Anggora ini sering digunakan sebagai wool.",R.drawable.k_anggora));
        kelincis.add(new Kelinci("Lop","Belanda",
                "Keunikan kelinci Lop yaitu pada bagian telinganya. Telinga kelinci Lop menggantung dari kepala sampai ke pipi yang mulai terlihat saat kelinci berumur 2-4 bulan. Ciri-ciri lain dari kelinci Lop adalah hidungnya yang pesek.  Ukuran tubuh yaitu 12-23 cm.",R.drawable.k_lop));
        kelincis.add(new Kelinci("Flemish Giant","Argentina",
                "Kelinci Flemish Giant memiliki ciri-ciri tubuh yang besar dengan berat paling ringan yaitu 8 kg dan yang paling berat bisa mencapai 13 kg, bahkan rekor terbesar mencapai 22,23 kg dalam Guinness World Records. Panjang tubuhnya mencapai 51 cm dan panjang telinga sampai 15 cm serta kaki besar.",R.drawable.k_felmishgiant));
        kelincis.add(new Kelinci("Rex","Perancis",
                "Kelinci Rex yang sering dibudidayakan mempunyai dua jenis yaitu Rex standard an Rex mini. Rex standar memiliki berat 3,6-5 kg, sedangkan Rex mini memiliki berat 1,4-2 kg. Bulu kelinci Rex memiliki teval sekitar 1-2 cm. Warna bulu yang diakui sebagai warna standar kelinci Rex yaitu hitam, biru, castor, lynx, opal, coklat, merah, putih, chinchilla, lilac, himalayan, broken, dan tricolor.",R.drawable.k_rex));
        kelincis.add(new Kelinci("Neteherland Dwarf","Belanda",
                "Ciri-ciri kelinci ini yaitu memiliki tubuh yang pendek, kepala bulat, leher pendek. Berat kelinci Netherland Dwarf hanya mencapai 1 kg. Warna bulu kelinci ini bervariasi namun yang paling diminati yaitu kelinci dengan warna bulu putih dan mata berwarna merah.",R.drawable.k_netherlanddwarf));
        kelincis.add(new Kelinci("Himalayan","Amerika",
                "Ciri-ciri kelinci ini yaitu warna bulu yang seputih salju dan memiliki kombinasi warna polkadot hitam disekitar hidungnya, serta tambahan warna lain di sekitar telinga dan ekor. Berat badan rata-rata yaitu 2,5-4,5 kg. Untuk kelinci berukuran mini memiliki berat 1 kg saja.",R.drawable.k_himalayan));
        return kelincis;
    }

    private static List<Kuda> initDataKuda(Context ctx) {
        List<Kuda> kudas = new ArrayList<>();
        kudas.add(new Kuda("Arab","Arab",
                "Kuda ini memiliki kondisi tubuh yang prima dan tingkat kecerdasan cukup tinggi, sehingga mudah untuk dilatih.\n" +
                        "Sedangkan untuk ketahanan tubuhnya sendiri juga prima dan lincah, sehingga wajar saja kalau kuda ini cukup diandalkan untuk berperang. Untuk tingginya sekitar 1,4 – 1,6 meter di usia dewasa, beratnya bisa mencapai 450 kg.",R.drawable.kd_arab));
        kudas.add(new Kuda("American Quarter","Amerika",
                "kuda ini memiliki kepala pendek, tubuhnya halus, kuat dan berotot, serta memiliki dada yang lebar. Kemudian bagian belakangnya kuat dan bundar, sehingga inilah yang menjadikannya memiliki kecepatan luar biasa dalam jarak pendek.",R.drawable.kd_americanquarter));
        kudas.add(new Kuda("Frisian","Friesland, Belanda",
                "Kuda ini cukup berbeda dan terlihat lebih cantik jika dibandingkan jenis lainnya. Kuda ini memiliki tinggi sekitar 152 – 173 cm ketika sudah dewasa, berwarna hitam, dan memiliki otot yang kuat.",R.drawable.kd_frisian));
        kudas.add(new Kuda("Mustang","Kanada",
                "Tinggi dari kuda Mustang ini di usia dewasa bisa sampai 1,3 – 1,5 meter. Walaupun memiliki tubuh yang tidak terlalu besar seperti jenis kuda sebelumnya, namun tetap saja kuda ini memiliki kekuatan yang lumayan hebat, terutama dalam berlari.",R.drawable.kd_mustang));
        kudas.add(new Kuda("Thoroughbred","Inggris",
                "Kuda ini memiliki tubuh yang tinggi, langsing, dan atletis. Dan dimanfaatkan sebagai balap dan olahraga berkuda lainnya, jelas kekuatan berlarinya sudah tidak bisa diragukan lagi. Cara perawatan kuda balap jenis ini pun berbeda dengan kuda lainnya.",R.drawable.kd_thoroughbred));
        kudas.add(new Kuda("Parcheron","Perancis",
                "Kuda ini merupakan salah satu kuda yang paling patuh dan mudah untuk dilatih, serta tidak gampang mengeluh ketika disuruh bekerja. Ciri khas warna kuda asal Perancis ini yakni abu-abu dan hitam, memiliki tungkai bersih, kuat, dan mudah untuk patuh terhadap pengasuhnya.",R.drawable.kd_percheron));
        return kudas;
    }

    private static List<Monyet> initDataMonyet(Context ctx) {
        List<Monyet> monyets = new ArrayList<>();
        monyets.add(new Monyet("Common Marmoset","Brazil",
                "Mereka memiliki ekor yang panjang dan saat dewasa mencapai berat maksimalnya sekitar 0,5 kg. Semakin dewasa common marmoset, maka rambut putih di sisi wajahnya semakin banyak.",R.drawable.m_commonmarmoset));
        monyets.add(new Monyet("Pygmy Marmoset","Amazon, Amerika Selatan",
                "Dinobatkan sebagai jenis monyet terkecil di dunia. Ukurannya hanya sebesar ukuran telapak tangan orang dewasa dengan berat hanya  sekitar 1 kg.",R.drawable.m_pygmymarmoset));
        monyets.add(new Monyet("Golden Lion Tamarin","Brazil",
                "Memiliki warna bulu oranye merah keemasan, dengan rambut lebat menutupi seluruh sisi pinggir wajahnya, membuat monyet ini seperti singa. Berat mereka tidak sampai setengah kilogram. Memiliki panjang tubuh hingga 35 cm, namun ekornya yang tipis memiliki panjang hingga 40 cm.",R.drawable.m_goldenliontamarin));
        monyets.add(new Monyet("Emperor Tamarin","Brazil dan Peru",
                "Ciri khas emperor tamarin tentu kumis putihnya yang panjang dan melengkung ke bawah. Panjang monyet ini hanya berkisar 23-26 cm, sedangkan ekornya termasuk panjang 35-41,5 cm. Berat emperor tamarin sekitar 500 gr.",R.drawable.m_emperortamarin));
        monyets.add(new Monyet("Cotton Top","Kolombia dan Brazil",
                "Salah satu primate terkecil dengan berat kurang dari setengah kilogram. Ciri khasnya tentu rambut putihnya yang panjang sampai melebihi bahu. Mungkin karena rambut dan bentuk tubuhnya, sebagian dari kamu menganggap monyet ini mirip karakter Blanka dari game Street Fighter.",R.drawable.m_cottontop));
        monyets.add(new Monyet("Squirrel Monkey","Amerika",
                "Termasuk monyet kecil dengan ukuran tubuh hanya sekitar 25 cm, dan ekornya memiliki panjang yang hampir sama. Berbeda dengan kebanyakan monyet berekor panjang lainnya, ekor squirrel monkey tidak dapat digunakan untuk menggenggam batang pohon.",R.drawable.m_squirelmonkey));
        return monyets;
    }

    private  static void  initAllHewans(Context ctx) {
        hewans.addAll(initDataMonyet(ctx));
        hewans.addAll(initDataKelinci(ctx));
        hewans.addAll(initDataKuda(ctx));
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
