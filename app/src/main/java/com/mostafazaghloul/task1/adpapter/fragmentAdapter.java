package com.mostafazaghloul.task1.adpapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mostafazaghloul.task1.fragment.acceptedFragment;
import com.mostafazaghloul.task1.fragment.cancelledFragment;
import com.mostafazaghloul.task1.fragment.pendingFragment;

public class fragmentAdapter extends FragmentPagerAdapter {
    public fragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new cancelledFragment();
        }else if(position ==1){
            return new acceptedFragment();
        }else{
            return new pendingFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
