package com.sunitarana.myprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserProfileFragment fragment = new UserProfileFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.container, fragment).commit();

    }
}