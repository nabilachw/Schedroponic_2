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

public class DB_ParseHama extends Activity {
    ImageView Im ;
    TextView tv_nama, tv_def, id;
    Gallery gallery;
    ImageSwitcher imageSwitcher;
    Integer[] imageIDs = new Integer[7];
    int msg_im;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hama);

        Intent iIdentifikasi = getIntent();
        msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
        String msg_nama = iIdentifikasi.getStringExtra("dataNama");
        String msg_def = iIdentifikasi.getStringExtra("dataDef");

        Im = (ImageView) findViewById(R.id.iv_detail);
        tv_nama = (TextView) findViewById(R.id.tvNama);
        tv_def = (TextView) findViewById(R.id.tvDef);


        Im.setImageResource(msg_im);
        tv_nama.setText(msg_nama);
        tv_def.setText(msg_def);

    }
}

