package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tablayout = findViewById(R.id.tablayout);
        ViewPager2 viewpager = findViewById(R.id.pager);

        sampleAdapter adapter = new sampleAdapter(getSupportFragmentManager(), getLifecycle());
        viewpager.setAdapter(adapter); //menampilkan tab ke viewpager

        TabLayoutMediator mediator = new TabLayoutMediator(tablayout, viewpager, new TabLayoutMediator.TabConfigurationStrategy() {
            //menautkan tablayout ke viewpager
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position == 0){
                    tab.setText("Masuk");
                }else{
                    tab.setText("Daftar");
                }
            }
        });
        mediator.attach();
    }
}