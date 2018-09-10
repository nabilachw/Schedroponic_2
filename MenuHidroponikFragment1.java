package com.bilcode.schedroponic_2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Djati on 08/05/18.
 */

public class MenuHidroponikFragment1 extends Fragment {


    public MenuHidroponikFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_about_hydroponic, container, false);

        View v = inflater.inflate(R.layout.fragment_hidroponik, container, false);

        String text = "<b>Apa itu Hidroponik? </b><br>" +
                "&nbsp&nbsp&nbsp <i> Hidroponik diambil dari bahasa Yunani yaitu hydro yang artinya air dan ponos yang artinya daya. Hidroponik juga dikenal dengan sebutan soilless culture yang artinya budidaya tanaman tanpa tanah. Jadi tanaman hidroponik adalah tanaman yang ditanam dengan pemanfaatan air dan tanpa penggunaan tanah sebagai media tanam. Pengertian tanaman hidroponik secara umum yaitu tanaman yang ditanam dengan memanfaatkan air tanpa menggunakan media tanah tetapi menekankan pada pemenuhan kebutuhan nutrisi tanaman untuk bisa tumbuh. <br><br></i>\n"+
                "<b>Media Tanam </b><br>"+
                "&nbsp&nbsp&nbsp <i>hidroponik tidak ditanam di media tanah melainkan media lain seperti bata merah, rockwool, kerikil, arang sekam dan sebagainya. Walaupun memanfaatkan air, tetapi air yang dibutuhkan hanya dalam jumlah kecil. Hal paling penting untuk tanaman hidroponik adalah pemenuhan nutrisi tanaman yang berbentuk larutan. Jadi, cara penanaman hidroponik sangat cocok untuk tempat yang pasokan airnya kurang. </i>\n "+
                "";

        WebView webView = (WebView) v.findViewById(R.id.wv_Hydro);
        webView.loadData("<p style=\"text-align:justify\">"+ text + "</p>","text/html", "UTF-8");
        return v;
    }

}
