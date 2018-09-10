package com.bilcode.schedroponic_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Djati on 06/08/18.
 */

public class DB_ParseTanaman extends Activity {
    ImageView Im;
    TextView tv_nama, tv_def, tv_character, tv_nutrition, tv_ageplant, tv_ageharvest, tv_readyharvest, id;
    Gallery gallery;
    ImageSwitcher imageSwitcher;
    Integer[] imageIDs = new Integer[7];
    int msg_im;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tanaman);

        Intent iIdentifikasi = getIntent();
        msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
        String msg_nama = iIdentifikasi.getStringExtra("dataNama");
        String msg_def = iIdentifikasi.getStringExtra("dataDef");
        String msg_character = iIdentifikasi.getStringExtra("dataCharacter");
        String msg_nutrition = iIdentifikasi.getStringExtra("dataNutrition");
        String msg_ageplant = iIdentifikasi.getStringExtra("dataAgeplant");
        String msg_ageharvest = iIdentifikasi.getStringExtra("dataAgeharvest");
        String msg_readyharvest = iIdentifikasi.getStringExtra("dataReadyharvest");

        Im = (ImageView) findViewById(R.id.iv_detail);
        tv_nama = (TextView) findViewById(R.id.tvNama);
        tv_def = (TextView) findViewById(R.id.tvDef);
        tv_character = (TextView) findViewById(R.id.tvCharacter);
        tv_nutrition = (TextView)  findViewById(R.id.tvNutrition);
        tv_ageplant = (TextView)  findViewById(R.id.tvAgePlant);
        tv_ageharvest = (TextView) findViewById(R.id.tvAgeHarvest);
        tv_readyharvest = (TextView) findViewById(R.id.tvReadyharvest);

        Im.setImageResource(msg_im);
        tv_nama.setText(msg_nama);
        tv_def.setText(msg_def);
        tv_character.setText(msg_character);
        tv_nutrition.setText(msg_nutrition);
        tv_ageplant.setText(msg_ageplant);
        tv_ageharvest.setText(msg_ageharvest);
        tv_readyharvest.setText(msg_readyharvest);
    }
}

