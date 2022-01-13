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
        kelincis.add(new Kelinci(ctx.getString(R.string.anggora_nama), ctx.getString(R.string.anggora_asal),
                ctx.getString(R.string.anggora_deskripsi), R.drawable.k_anggora));
        kelincis.add(new Kelinci(ctx.getString(R.string.lop_nama), ctx.getString(R.string.lop_asal),
                ctx.getString(R.string.lop_deskripsi), R.drawable.k_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.flemish_nama), ctx.getString(R.string.flemish_asal),
                ctx.getString(R.string.flemish_deskripsi), R.drawable.k_felmishgiant));
        kelincis.add(new Kelinci(ctx.getString(R.string.rex_nama), ctx.getString(R.string.rex_asal),
                ctx.getString(R.string.rex_deskripsi), R.drawable.k_rex));
        kelincis.add(new Kelinci(ctx.getString(R.string.neteherland_nama), ctx.getString(R.string.neteherland_asal),
                ctx.getString(R.string.netherland_deskripsi), R.drawable.k_netherlanddwarf));
        kelincis.add(new Kelinci(ctx.getString(R.string.himalayan_nama), ctx.getString(R.string.himalayan_asal),
                ctx.getString(R.string.himalayan_deskripsi), R.drawable.k_himalayan));
        kelincis.add(new Kelinci(ctx.getString(R.string.anggora_nama), ctx.getString(R.string.anggora_asal),
                ctx.getString(R.string.anggora_deskripsi), R.drawable.k_anggora));
        kelincis.add(new Kelinci(ctx.getString(R.string.lop_nama), ctx.getString(R.string.lop_asal),
                ctx.getString(R.string.lop_deskripsi), R.drawable.k_lop));
        kelincis.add(new Kelinci(ctx.getString(R.string.flemish_nama), ctx.getString(R.string.flemish_asal),
                ctx.getString(R.string.flemish_deskripsi), R.drawable.k_felmishgiant));
        kelincis.add(new Kelinci(ctx.getString(R.string.rex_nama), ctx.getString(R.string.rex_asal),
                ctx.getString(R.string.rex_deskripsi), R.drawable.k_rex));
        kelincis.add(new Kelinci(ctx.getString(R.string.neteherland_nama), ctx.getString(R.string.neteherland_asal),
                ctx.getString(R.string.netherland_deskripsi), R.drawable.k_netherlanddwarf));
        kelincis.add(new Kelinci(ctx.getString(R.string.himalayan_nama), ctx.getString(R.string.himalayan_asal),
                ctx.getString(R.string.himalayan_deskripsi), R.drawable.k_himalayan));
        return kelincis;
    }

    private static List<Kuda> initDataKuda(Context ctx) {
        List<Kuda> kudas = new ArrayList<>();
        kudas.add(new Kuda(ctx.getString(R.string.arab_nama), ctx.getString(R.string.arab_asal),
                ctx.getString(R.string.arab_deskripsi), R.drawable.kd_arab));
        kudas.add(new Kuda(ctx.getString(R.string.american_nama), ctx.getString(R.string.american_asal),
                ctx.getString(R.string.american_deskripsi), R.drawable.kd_americanquarter));
        kudas.add(new Kuda(ctx.getString(R.string.frisian_nama), ctx.getString(R.string.frisian_asal),
                ctx.getString(R.string.frisian_deskripsi), R.drawable.kd_frisian));
        kudas.add(new Kuda(ctx.getString(R.string.mustang_nama), ctx.getString(R.string.mustang_asal),
                ctx.getString(R.string.mustang_deskripsi), R.drawable.kd_mustang));
        kudas.add(new Kuda(ctx.getString(R.string.thoroughbred_nama), ctx.getString(R.string.thoroughbred_asal),
                ctx.getString(R.string.thoroughbred_deskripsi), R.drawable.kd_thoroughbred));
        kudas.add(new Kuda(ctx.getString(R.string.parcheron_nama), ctx.getString(R.string.parcheron_asal),
                ctx.getString(R.string.parcheron_deskripsi), R.drawable.kd_percheron));
        return kudas;
    }

    private static List<Monyet> initDataMonyet(Context ctx) {
        List<Monyet> monyets = new ArrayList<>();
        monyets.add(new Monyet(ctx.getString(R.string.common_nama), ctx.getString(R.string.common_asal),
                ctx.getString(R.string.common_deskripsi), R.drawable.m_commonmarmoset));
        monyets.add(new Monyet(ctx.getString(R.string.pygmy_nama), ctx.getString(R.string.pygmy_asal),
                ctx.getString(R.string.pygmy_deskripsi), R.drawable.m_pygmymarmoset));
        monyets.add(new Monyet(ctx.getString(R.string.golden_nama), ctx.getString(R.string.golden_asal),
                ctx.getString(R.string.golden_deskripsi), R.drawable.m_goldenliontamarin));
        monyets.add(new Monyet(ctx.getString(R.string.emperor_nama), ctx.getString(R.string.emperor_asal),
                ctx.getString(R.string.emperor_deskripsi), R.drawable.m_emperortamarin));
        monyets.add(new Monyet(ctx.getString(R.string.cotton_nama), ctx.getString(R.string.cotton_asal),
                ctx.getString(R.string.cotton_deskripsi), R.drawable.m_cottontop));
        monyets.add(new Monyet(ctx.getString(R.string.squirrel_nama), ctx.getString(R.string.squirrel_asal),
                ctx.getString(R.string.squirrel_deskripsi), R.drawable.m_squirelmonkey));
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
