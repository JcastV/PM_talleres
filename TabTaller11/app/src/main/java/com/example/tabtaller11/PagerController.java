package com.example.tabtaller11;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {

    int numOfTabs;

    public PagerController(@NonNull FragmentManager fm, int behavior){
        super(fm, behavior);
        this.numOfTabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new Frag_Taller9();
            case 1:
                return new Frag_Taller10();
            case 2:
                return new Frag_Taller11();
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
