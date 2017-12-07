package com.arvn.trasearchver01;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ARVN on 12/7/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{

    int noOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.noOfTabs = NumberOfTabs;
    }

    @Override
     public Fragment getItem(int position) {

        switch(position)
        {
            case 0:
                HomeTab homeTab = new HomeTab();
                return homeTab;
            case 1:
                DashboardTab dashboardTab = new DashboardTab();
                return dashboardTab;
            case 2:
                RecyclingCenterTab recyclingCenterTab = new RecyclingCenterTab();
                return recyclingCenterTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
