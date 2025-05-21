package com.arsoft.viewpagerapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    MyViewPagerAdapter myViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager2);

        myViewPagerAdapter = new MyViewPagerAdapter(
                getSupportFragmentManager(),
                getLifecycle()
        );

        // Adding Fragments to the list in the Adapter Class
        myViewPagerAdapter.addFragment(new Fragment1());
        myViewPagerAdapter.addFragment(new Fragment2());
        myViewPagerAdapter.addFragment(new Fragment3());

        // Set the orientation in ViewPager2
        viewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        // Connection the Adapter with the ViewPager2
        viewPager.setAdapter(myViewPagerAdapter);




    }
}