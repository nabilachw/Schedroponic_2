package com.bilcode.schedroponic_2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Djati on 07/28/18.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MenuHidroponikFragment1();
            case 1:
                return new MenuHidroponikFragment2();
            case 2:
                return new MenuHidroponikFragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
