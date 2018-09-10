package com.bilcode.schedroponic_2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MenuLahan extends AppCompatActivity {

    ImageButton tanamanmu, tambahtanaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Lahan Hidroponik");
        setContentView(R.layout.activity_menu_lahan);

        tanamanmu = (ImageButton) findViewById(R.id.tanamanmu);
        tanamanmu.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(MenuLahan.this, SubMenuLahanTanaman.class);
                                         startActivity(intent);
                                     }
                                 }
        );

        tambahtanaman = (ImageButton) findViewById(R.id.tambahtanaman);
        tambahtanaman.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent intent = new Intent(MenuLahan.this, SubMenuLahanTambah.class);
                                              startActivity(intent);
                                          }
                                      }
        );


    }
}
