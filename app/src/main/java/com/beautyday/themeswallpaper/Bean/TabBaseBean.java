package com.beautyday.themeswallpaper.Bean;

import android.support.v4.app.Fragment;

/**
 * Created by xuxiaolei on 2018/7/12.
 */

public class TabBaseBean {
    public int tabId = 0;
    public int tabIndex = 0;
    public String tabName = "";
    public int tabSelectIcon = 0;
    public int tabNormalIcon = 0;
    public Fragment tabFragment = null;
    @Override
    public String toString() {
        return "TabBaseBean{" +
                "tabId=" + tabId +
                ", tabIndex=" + tabIndex +
                ", tabName='" + tabName + '\'' +
                ", tabSelectIcon=" + tabSelectIcon +
                ", tabNormalIcon=" + tabNormalIcon +
                '}';
    }
}
