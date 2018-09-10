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

public class MenuHidroponikFragment3 extends Fragment {


    public MenuHidroponikFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hidroponik, container, false);

        String text = "<b>Penyiapan Nutrisi </b><br>" +
                "&nbsp&nbsp&nbsp Pupuk yang biasanya digunakan yaitu pupuk ABmix (Gambar 3.3). Selain itu, alat-alat yang dibutuhkan yaitu botol bekas air mineral, gelas ukur, TDS meter (Gambar 3.3), dan sendok pengaduk. Sebaiknya pada botol bekas diberi label pupuk A dan pupuk B. Pupuk kemasan kecil digunakan untuk membuat stok pupuk sebanyak masing-masing 500 ml. Pupuk A dimasukkan ke dalam gelas ukur, kemudian ditambahkan dengan air sampai 500 ml, kemudian diaduk sampai larut. Pupuk A dimasukkan ke dalam botol berlabel A. Cara yang sama dilakukan untuk pupuk B.  <br>\n"+

                "&nbsp&nbsp&nbsp Masing-masing konsentrat pupuk ini dapat digunakan sebagai stok. Untuk membuat larutan pupuk sebagai nutrisi tanaman maka digunakan perbandingan 5ml pupuk A + 5 ml pupuk B + 1 liter air. Untuk pemakaian dalam jumlah yang banyak, 50 ml pupuk A + 50 ml pupuk B + 8 L air, akan menghasilkan konsentrasi pupuk sekitar 1400 ppm. Kebutuhan masing-masing tumbuhan berbeda. Konsentrasi pupuk untuk jenis-jenis tanaman dapat dilihat pada Tabel 3.1. Masa panen tanaman dapat dilihat pada Tabel 3.2, dan kualitas hasil panen dapat dilihat pada Tabel 3.3.  \n"+
                "";

        WebView webView = (WebView) v.findViewById(R.id.wv_Hydro);
        webView.loadData("<p style=\"text-align:justify\">"+ text + "</p>","text/html", "UTF-8");
        return v;
    }

}

