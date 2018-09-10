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

public class MenuHidroponikFragment2 extends Fragment {


    public MenuHidroponikFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hidroponik, container, false);

        String text = "<b> Alat dan Bahan </b><br>" +
                "Bahan-bahan yang dibutuhkan yaitu:<br>"+
                " <ul> <li>Benih tanaman (buah-buahan atau sayuran. Contoh buahbuahan yaitu stoberi, tomat, paprika; contoh sayuran yaitu pakcoy, kangkung, bayam, dan selada).</li>"+
                "<li>Netpot (wadah untuk tanaman).</li>"+
                "<li>Rockwool (media tanam yang bersifat menyerap dan menyimpan air).</li>"+
                "Sumbu (digunakan pada beberapa jenis sistem)."+
                "<li>Pupuk (biasanya menggunakan Abmix untuk sayuran maupun buah-buahan).  </li>"+
                "</ul><br><br>"+

                "<b> Penyemaian </b><br>" +
                "Penyemaian merupakan tahap awal dalam berkebun hidroponik. Media yang digunakan yaitu rockwool. Cara menyemai yaitu sebagai berikut:<br>"+
                " <ul> <li>Media tanam rockwool dipotong kecil, diletakkan di atas wadah, dan dibasahi dengan air secukupnya agar basah.</li>"+
                "<li>Pada rockwool dibuat lubang dengan menggunakan tusuk gigi untuk tempat bibit.</li>"+
                "<li>Bibit tanaman dimasukkan ke dalam lubang dan wadah disimpan di dalam tempat gelap; Untuk  tanaman yang menjulang tinggi seperti  sawi, bayam dan kangkung, 1 rockwool bisa diisi 2-3 benih, tetapi untuk yang tumbuh kesamping seperti pakchoy dan selada cukup 1 benih saja. Untuk cabe dan tomat  cukup 1-2 benih.</li>"+
                "<li>Kelembaban rockwool harus diperiksa secara berkala. Apabila kering, maka perlu ditambahkan air. </li>"+
                "<li>Setelah 1-4 hari, bibit akan pecah yang ditandai dengan warna putih. Lamanya pecah tergantung dari jenis tanaman.</li>"+
                "<li>Jika benih tanaman sudah pecah, maka wadah ditempatkan di daerah yang terkena sinar matahari minimal 6 jam sehari.</li>"+
                "<li>Setelah berdaun empat, tanaman dipindahkan ke instalasi hidroponik yang telah diberi pupuk cair sesuai dengan konsentrasi yang dibutuhkan tanaman.</li>"+
                "</ul>";


        WebView webView = (WebView) v.findViewById(R.id.wv_Hydro);
        webView.loadData("<p style=\"text-align:justify\">"+ text + "</p>","text/html", "UTF-8");
        return v;
    }

}

