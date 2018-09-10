package com.bilcode.schedroponic_2;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MenuSistem extends AppCompatActivity {

    protected GridView lv;
    protected ListAdapter adapter;
    SQLiteDatabase db;
    Cursor cursor;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Sistem Hidroponik");
        setContentView(R.layout.content_menu);




        db = (new DB_SCHEDROPONIC(this)).getWritableDatabase();
        lv = (GridView) findViewById(R.id.lv);


        try {
            cursor = db.rawQuery("SELECT * FROM NavSystemGrow ORDER BY _id ASC", null);
            adapter = new SimpleCursorAdapter(this, R.layout.item_list, cursor,
                    new String[] { "nama",  "img" }, new int[] {
                    R.id.tv_nama,  R.id.imV });
            lv.setAdapter(adapter);
            lv.setTextFilterEnabled(true);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View v,
                                        int position, long id) {
                    detail(position);

//                    Typeface sanvitoSB = Typeface.createFromAsset(getAssets(),"fonts/SanvitoPro-Semibold.otf");
//                    TextView tv_nama = (TextView) findViewById(R.id.tv_nama);
//                    tv_nama.setTypeface(sanvitoSB);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public void detail(int position) {
        int im = 0;
        int ims = 0;
        String _id = "";
        String nama = "";
        String def = "";
        String tool = "";
        String material = "";
        String commodity = "";
        String advantage = "";
        String disadvantage = "";
        if (cursor.moveToFirst()) {
            cursor.moveToPosition(position);
            im = cursor.getInt(cursor.getColumnIndex("img"));
            nama = cursor.getString(cursor.getColumnIndex("nama"));
            def = cursor.getString(cursor.getColumnIndex("def"));
            ims = cursor.getInt(cursor.getColumnIndex("imgscheme"));
            tool = cursor.getString(cursor.getColumnIndex("tool"));
            material = cursor.getString(cursor.getColumnIndex("material"));
            commodity = cursor.getString(cursor.getColumnIndex("commodity"));
            advantage = cursor.getString(cursor.getColumnIndex("advantage"));
            disadvantage = cursor.getString(cursor.getColumnIndex("disadvantage"));
        }

        Intent iIntent = new Intent(this, DB_ParseSistem.class);
        iIntent.putExtra("dataIM", im);
        iIntent.putExtra("dataNama", nama);
        iIntent.putExtra("dataDef", def);
        iIntent.putExtra("dataIMS", ims);
        iIntent.putExtra("dataTool", tool);
        iIntent.putExtra("dataMaterial", material);
        iIntent.putExtra("dataCommodity", commodity);
        iIntent.putExtra("dataAdvantage", advantage);
        iIntent.putExtra("dataDisadvantage", disadvantage);
        setResult(RESULT_OK, iIntent);
        startActivityForResult(iIntent, 99);

    }
}

