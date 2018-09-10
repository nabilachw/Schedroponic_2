package com.bilcode.schedroponic_2;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SubMenuLahanTambah extends AppCompatActivity {

    protected GridView gv;
    protected ListAdapter adapter;
    SQLiteDatabase db;
    Cursor cursor;


    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Tambah Tanaman");
        setContentView(R.layout.activity_sub_menu_lahan_tambah);

        db = (new DB_SCHEDROPONIC(this)).getWritableDatabase();
        gv = (GridView) findViewById(R.id.gv);


        try {
            cursor = db.rawQuery("SELECT * FROM Field ORDER BY nama ASC", null);
            adapter = new SimpleCursorAdapter(this, R.layout.item_list, cursor,
                    new String[] { "nama",  "img" }, new int[] {
                    R.id.tv_nama,  R.id.imV });
            gv.setAdapter(adapter);
            gv.setTextFilterEnabled(true);
            gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View v,
                                        int position, long id) {
                    detail(position);

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void detail(int position) {

        final View dialogView = View.inflate(this,R.layout.dialog_view,null);

        final Dialog dialog = new Dialog(this, R.style.MyAlertDialogStyle);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(dialogView);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.show();
    }
}






