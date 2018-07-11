package com.example.khadijah.fragment2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by khadijah on 12/26/2017.
 */
public class FragmentAdapterSimple extends FragmentPagerAdapter {

    private Context mContext;
    public FragmentAdapterSimple(Context context, FragmentManager fm)
    {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SaturdayFragment();
        } else {
            return new SundayFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.string1);
        } else  {
            return mContext.getString(R.string.string2);
        }
    }

}
