package com.example.login;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class sampleAdapter extends FragmentStateAdapter {

    public sampleAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) { //mengatur fragment yang akan ditampilkan
        if (position == 0){
            LoginFragment login = new LoginFragment();
            return login;
        }else{
            SigninFragment signin = new SigninFragment();
            return signin;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
