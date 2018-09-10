package com.bilcode.schedroponic_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Djati on 05/31/18.
 */

public class DB_ParseSistem extends Activity {
    ImageView Im, Ims;
    TextView tv_nama,  id, tv_def, tv_tool, tv_material, tv_commodity, tv_advantage, tv_disadvantage;
    Gallery gallery;
    ImageSwitcher imageSwitcher;
    Integer[] imageIDs = new Integer[7];
    int msg_im, msg_ims;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sistem);

        Intent iIdentifikasi = getIntent();
        msg_im = iIdentifikasi.getIntExtra("dataIM", 0);
        String msg_nama = iIdentifikasi.getStringExtra("dataNama");
        String msg_def = iIdentifikasi.getStringExtra("dataDef");
        msg_ims = iIdentifikasi.getIntExtra("dataIMS", 0);
        String msg_tool = iIdentifikasi.getStringExtra("dataTool");
        String msg_material = iIdentifikasi.getStringExtra("dataMaterial");
        String msg_commodity = iIdentifikasi.getStringExtra("dataCommodity");
        String msg_advantage = iIdentifikasi.getStringExtra("dataAdvantage");
        String msg_disadvantage = iIdentifikasi.getStringExtra("dataDisadvantage");

        Im = (ImageView) findViewById(R.id.iv_detail);
        tv_nama = (TextView) findViewById(R.id.tvNama);
        tv_def = (TextView) findViewById(R.id.tvDef);
        Ims = (ImageView) findViewById(R.id.iv_scheme);
        tv_tool = (TextView) findViewById(R.id.tvTool);
        tv_material = (TextView)  findViewById(R.id.tvMaterial);
        tv_commodity = (TextView)  findViewById(R.id.tvCommodity);
        tv_advantage = (TextView) findViewById(R.id.tvAdvantage);
        tv_disadvantage = (TextView) findViewById(R.id.tvDisadvantage);

        Im.setImageResource(msg_im);
        tv_nama.setText(msg_nama);
        tv_def.setText(msg_def);
        Ims.setImageResource(msg_ims);
        tv_tool.setText(msg_tool);
        tv_material.setText(msg_material);
        tv_commodity.setText(msg_commodity);
        tv_advantage.setText(msg_advantage);
        tv_disadvantage.setText(msg_disadvantage);
    }
}