package com.example.emraz_apps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Package_detail extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.package_detail, container, false);

        ImageSlider imageSlider = view.findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add (new SlideModel(R.drawable.haji1, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.haji2, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.haji3, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.haji4, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.haji5, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.haji6, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.haji7, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.haji8, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.haji9, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
        Button bookingPackage = (Button) view.findViewById(R.id.submit);
        bookingPackage.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View view) {
        HajiFragment fragment2 = new HajiFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment2);
        fragmentTransaction.commit();


    }
}
