package com.example.lenovo.perusinanemiav1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by gustavo.peiretti on 13/2/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numTabs;
    private DummyModel[] dummyModels0;
    private DummyModel[] dummyModels1;
    private DummyModel[] dummyModels2;

    public PagerAdapter(FragmentManager fm, int numTabs, DummyModel[] dummyModels0,
                        DummyModel[] dummyModels1, DummyModel[] dummyModels2) {
        super(fm);
        this.numTabs = numTabs;
        this.dummyModels0 = dummyModels0;
        this.dummyModels1 = dummyModels1;
        this.dummyModels2 = dummyModels2;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ItemFragment Dia1 = ItemFragment.newInstance(dummyModels0);
                return Dia1;
            case 1:
                ItemFragment Dia2 = ItemFragment.newInstance(dummyModels1);
                return Dia2;
            case 2:
                ItemFragment Dia3 = ItemFragment.newInstance(dummyModels2);
                return Dia3;
            default:
                throw new RuntimeException("Tab position invalid " + position);
        }
    }

    @Override
    public int getCount() {
        return numTabs;
    }

}
