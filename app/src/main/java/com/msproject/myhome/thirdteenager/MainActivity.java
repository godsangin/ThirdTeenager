package com.msproject.myhome.thirdteenager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    private BucketsFragment bucketsFragment = new BucketsFragment();
    private MyBucketFragment myBucketFragment = new MyBucketFragment();
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        fragmentTransaction.replace(R.id.frame_layout, bucketsFragment).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (menuItem.getItemId()){
                    case R.id.navigation_shared:
                        transaction.replace(R.id.frame_layout, bucketsFragment).commitAllowingStateLoss();
                        break;
                    case R.id.navigation_mybucket:
                        transaction.replace(R.id.frame_layout, myBucketFragment).commitAllowingStateLoss();
                        break;
                    case R.id.navigation_rank:
                        break;
                    case R.id.navigation_chat:
                        break;

                }
                return true;
            }
        });

    }
}
