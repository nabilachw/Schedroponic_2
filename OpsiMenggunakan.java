package com.bilcode.schedroponic_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class OpsiMenggunakan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opsi_menggunakan);

        WebView webView = (WebView) findViewById(R.id.wv_Use);

        String text = "<b><center>Schedule for Hydroponic </center></b><br>" +
                "&nbsp&nbsp&nbsp <i> Adalah Aplikasi Mobile untuk penggiat Hydroponik, khususnya bai pemula. <br><br></i>\n"+
                "<b>Media Tanam </b><br>"+
                "&nbsp&nbsp&nbsp <i>hidroponik tidak ditanam di media tanah melainkan media lain seperti bata merah, rockwool, kerikil, arang sekam dan sebagainya. Walaupun memanfaatkan air, tetapi air yang dibutuhkan hanya dalam jumlah kecil. Hal paling penting untuk tanaman hidroponik adalah pemenuhan nutrisi tanaman yang berbentuk larutan. Jadi, cara penanaman hidroponik sangat cocok untuk tempat yang pasokan airnya kurang. </i>\n "+
                "";


        webView.loadData("<p style=\"text-align:justify\">"+ text + "</p>","text/html", "UTF-8");
    }
}
