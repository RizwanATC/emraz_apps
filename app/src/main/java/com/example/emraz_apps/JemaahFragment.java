package com.example.emraz_apps;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;


public class JemaahFragment extends Fragment implements View.OnClickListener {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jemaah, container, false);
        Button payment = (Button) view.findViewById(R.id.submit);
        payment.setOnClickListener(this);




        return view;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(getActivity(), Payment_selection.class);
        startActivity(intent);



    }
}