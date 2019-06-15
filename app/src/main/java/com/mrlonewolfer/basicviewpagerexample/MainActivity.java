package com.mrlonewolfer.basicviewpagerexample;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Context context;
    ArrayList<Fragment> fragments;
    ViewpagerAdapter viewpagerAdapter;
    ArrayList<String> titleString;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewPager);
        fragments=new ArrayList<>();
        fragments.add(new FirstFragment());
        fragments.add(new SecondFragment());
        fragments.add(new ThirdFragment());

        titleString= new ArrayList<>();
        titleString.add("First Fragment");
        titleString.add("Second Fragment");
        titleString.add("Third Fragment");
        tabLayout=findViewById(R.id.tabMode);

        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager(),fragments,titleString);
        viewPager.setAdapter(viewpagerAdapter);
      tabLayout.setupWithViewPager(viewPager);

    }
}
