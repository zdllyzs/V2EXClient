package com.zdlly.v2exclient.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class MyPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    private List<String> listTitle;


    public MyPagerAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> listTitle) {
        super(fm);
        this.fragmentList = fragmentList;
        this.listTitle = listTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return listTitle.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle.get(position);
    }
}

