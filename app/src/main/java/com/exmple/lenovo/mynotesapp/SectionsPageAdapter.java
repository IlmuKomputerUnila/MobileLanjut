package com.exmple.lenovo.mynotesapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPageAdapter extends FragmentPagerAdapter {
    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
// Top Rated fragment activity
                return new Fragment1();
            case 1:
// Games fragment activity
                return new Fragment2();
        }

        return null;
    }

    @Override
    public int getCount() {
// get item count - equal to number of tabs
        return 3;
    }

    public void addFragment(Fragment1 fragment1, String tab1) {
    }

    public void addFragment2(Fragment2 fragment2, String tab2) {
    }
}