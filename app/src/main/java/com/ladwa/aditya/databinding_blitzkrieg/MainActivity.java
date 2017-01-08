package com.ladwa.aditya.databinding_blitzkrieg;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ladwa.aditya.databinding_blitzkrieg.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Aditya", "Ladwa", 22);
        binding.setUser(user);
        binding.setPresenter(new Presenter(this));
    }
}
