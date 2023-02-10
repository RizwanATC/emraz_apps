package com.example.emraz_apps;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.emraz_apps.databinding.BookingMainBinding;
import com.example.emraz_apps.databinding.MainLobbyBinding;

public class BookingMain extends AppCompatActivity {

    BookingMainBinding bookingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bookingBinding = BookingMainBinding.inflate(getLayoutInflater());
        setContentView(bookingBinding.getRoot());
        replaceFragment(new Package_detail());



    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

}
