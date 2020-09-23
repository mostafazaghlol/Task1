package com.mostafazaghloul.task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.gigamole.navigationtabstrip.NavigationTabStrip;
import com.mostafazaghloul.task1.adpapter.fragmentAdapter;
import com.mostafazaghloul.task1.utils.screenwithoutAction;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    fragmentAdapter mFragmentAdapter;
    NavigationTabStrip mNavigationTabStrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screenwithoutAction.FullScreen(this);
        viewPager = (ViewPager)findViewById(R.id.pager1);
        mFragmentAdapter = new fragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mFragmentAdapter);
        mNavigationTabStrip = (NavigationTabStrip)findViewById(R.id.strip);
        mNavigationTabStrip.setViewPager(viewPager);

    }
}