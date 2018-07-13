package com.beautyday.themeswallpaper.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.beautyday.themeswallpaper.Adapter.TabAdapter;
import com.beautyday.themeswallpaper.Bean.TabBaseBean;
import com.beautyday.themeswallpaper.Fragment.DynomicFragment;
import com.beautyday.themeswallpaper.Fragment.ThemeFragment;
import com.beautyday.themeswallpaper.Fragment.WallpaperFragment;
import com.beautyday.themeswallpaper.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private ViewPager viewPager = null;
    private TabAdapter pagerAdapter = null;
    private TabLayout tabLayout;
    private ArrayList<TabBaseBean> tabList = new ArrayList<TabBaseBean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initFragmentData();
        initTab();
    }



    private void initTab(){

        pagerAdapter = new TabAdapter(getSupportFragmentManager(), this, tabList);
        viewPager = (ViewPager) findViewById(R.id.home_viewpager);
        viewPager.setAdapter(pagerAdapter);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setSelectedTabIndicatorHeight(0);
        ViewCompat.setElevation(tabLayout, 10);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabList.size(); i++) {
            TabLayout.Tab itemTab = tabLayout.getTabAt(i);
            if (itemTab!=null){
                itemTab.setCustomView(R.layout.tab_item_layout);
                TextView itemTv = (TextView) itemTab.getCustomView().findViewById(R.id.tab_item_text);
                itemTv.setText(tabList.get(i).tabName);
            }
        }
        tabLayout.getTabAt(2).getCustomView().setSelected(true);

    }


    private void initFragmentData() {
        TabBaseBean tab1 = new TabBaseBean();
        tab1.tabFragment = new ThemeFragment();
        tab1.tabName = "主题";

        TabBaseBean tab2 = new TabBaseBean();
        tab2.tabFragment = new WallpaperFragment();
        tab2.tabName = "壁纸";

        TabBaseBean tab3 = new TabBaseBean();
        tab3.tabFragment = new DynomicFragment();
        tab3.tabName = "动态";

        TabBaseBean tab4 = new TabBaseBean();
        tab4.tabFragment = new ThemeFragment();
        tab4.tabName = "我的";
        tabList.clear();
        tabList.add(tab1);
        tabList.add(tab2);
        tabList.add(tab3);
        tabList.add(tab4);
    }
}
