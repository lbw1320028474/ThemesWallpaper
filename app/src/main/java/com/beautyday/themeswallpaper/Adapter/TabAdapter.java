package com.beautyday.themeswallpaper.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.beautyday.themeswallpaper.Bean.TabBaseBean;
import com.beautyday.themeswallpaper.Fragment.DynomicFragment;
import com.beautyday.themeswallpaper.Fragment.MyFragment;
import com.beautyday.themeswallpaper.Fragment.ThemeFragment;
import com.beautyday.themeswallpaper.Fragment.WallpaperFragment;

import java.util.ArrayList;

/**
 * Created by xuxiaolei on 2018/7/12.
 */

public class TabAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private ViewPager mViewPager;
    private ArrayList<TabBaseBean> mTabs = new ArrayList<TabBaseBean>();


    public TabAdapter(FragmentManager fm, Context context, ArrayList<TabBaseBean> mTabs) {
        super(fm);
        this.mContext = context;
        this.mTabs = mTabs;
    }

    @Override
    public Fragment getItem(int position) {
       return mTabs.get(position).tabFragment;
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs.get(position).tabName;
    }
}
