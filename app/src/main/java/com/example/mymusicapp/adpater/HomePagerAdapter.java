package com.example.mymusicapp.adpater;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mymusicapp.fragment.DiscoryFragment;
import com.example.mymusicapp.fragment.FriendFragment;
import com.example.mymusicapp.fragment.MineFragment;
import com.example.mymusicapp.model.CHANNEL;

public class HomePagerAdapter extends FragmentPagerAdapter {
    private CHANNEL[] mList;

    public HomePagerAdapter(FragmentManager fm, CHANNEL[] datas) {
        super(fm);
        mList = datas;
    }
    @Override
    public Fragment getItem(int i) {
        int type = mList[i].getValue();
        switch (type){
            case CHANNEL.MINE_ID:
                return MineFragment.newInstance();
            case CHANNEL.DISCORY_ID:
                return DiscoryFragment.newInstance();
            case CHANNEL.FRIEND_ID:
                return FriendFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        if(mList == null){
            return 0;
        }else {
            return mList.length;
        }
    }

}
