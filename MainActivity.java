package com.bilcode.schedroponic_2;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton lahan, hidroponik, sistem, tanaman, hama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Typeface segoepr = Typeface.createFromAsset(getAssets(),"fonts/segoepr.ttf");
//
        TextView txtlahan = (TextView) findViewById(R.id.txtlahan);
        txtlahan.setTypeface(segoepr);
        lahan = (ImageButton) findViewById(R.id.lahan);
        lahan.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(MainActivity.this, MenuLahan.class);
                                         startActivity(intent);
                                     }
                                 }
        );

        TextView txthidroponik = (TextView) findViewById(R.id.txthidroponik);
        txthidroponik.setTypeface(segoepr);
        hidroponik = (ImageButton) findViewById(R.id.hidroponik);
        hidroponik.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Intent intent = new Intent(MainActivity.this, MenuHidroponik.class);
                                              startActivity(intent);
                                          }
                                      }
        );

        TextView txtsistem = (TextView) findViewById(R.id.txtsistem);
        txtsistem.setTypeface(segoepr);
        sistem = (ImageButton) findViewById(R.id.sistem);
        sistem.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intent = new Intent(MainActivity.this, MenuSistem.class);
                                          startActivity(intent);
                                      }
                                  }
        );

        TextView txttanaman = (TextView) findViewById(R.id.txttanaman);
        txttanaman.setTypeface(segoepr);
        tanaman = (ImageButton) findViewById(R.id.tanaman);
        tanaman.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent intent = new Intent(MainActivity.this, MenuTanaman.class);
                                           startActivity(intent);
                                       }
                                   }
        );

        TextView txthama = (TextView) findViewById(R.id.txthama);
        txthama.setTypeface(segoepr);
        hama = (ImageButton) findViewById(R.id.hama);
        hama.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent = new Intent(MainActivity.this, MenuHama.class);
                                        startActivity(intent);
                                    }
                                }
        );

//        // Menginisiasi Toolbar dan mensetting sebagai actionbar
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opsi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MainActivity.this, OpsiPengaturan.class);
            startActivity(intent);

        } else if (id == R.id.action_about) {
            Intent intent = new Intent(MainActivity.this, OpsiAplikasi.class);
            startActivity(intent);

        } else if (id == R.id.action_use) {
            Intent intent = new Intent(MainActivity.this, OpsiMenggunakan.class);
            startActivity(intent);

        } else if (id == R.id.action_profile) {
            Intent intent = new Intent(MainActivity.this, OpsiDeveloper.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}


