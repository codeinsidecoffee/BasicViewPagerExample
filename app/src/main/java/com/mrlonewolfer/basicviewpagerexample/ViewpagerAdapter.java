package com.mrlonewolfer.basicviewpagerexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class ViewpagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragments;
    ArrayList<String> titleString;

    public ViewpagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments, ArrayList<String> titleString) {
        super(fm);
        this.fragments=fragments;
        this.titleString=titleString;
    }

    public CharSequence getPageTitle(int position) {
        return titleString.get(position);
    }
    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
