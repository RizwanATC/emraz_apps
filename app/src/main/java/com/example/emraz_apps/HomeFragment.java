package com.example.emraz_apps;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements View.OnClickListener {



    private ViewPager viewPager;

    private ArrayList<MyModel> modelArrayList;
    private MyAdapter myAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ImageSlider imageSlider = (ImageSlider)view.findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add (new SlideModel(R.drawable.image1, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.image2, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.image3, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.image4, ScaleTypes.FIT));
        slideModels.add (new SlideModel(R.drawable.image5, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);

        Button proceed =  (Button) view.findViewById(R.id.goButton);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BookingMain.class);
                startActivity(intent);

            }
        });
        return view;


    }

    private void loadCard() {

        modelArrayList = new ArrayList<>();
        modelArrayList.add(new MyModel(
                "Pakej Umrah 1445H | VIP Pakej | 350M",
                "1. Pakej 12 hari 10 Malam \n2. Hotel Makkah (6 Malam) : Anwar Deafah hotel 350 meter atau setaraf \n",
                "09/02/2023",
                R.drawable.haji1) );
        modelArrayList.add(new MyModel(
                "Title 01",
                "Description 02",
                "09/02/2023",
                R.drawable.haji2) );
        modelArrayList.add(new MyModel(
                "Title 01",
                "Description 02",
                "09/02/2023",
                R.drawable.haji3) );
        modelArrayList.add(new MyModel(
                "Title 01",
                "Description 02",
                "09/02/2023",
                R.drawable.haji4) );
        modelArrayList.add(new MyModel(
                "Title 01",
                "Description 02",
                "09/02/2023",
                R.drawable.haji5) );
        modelArrayList.add(new MyModel(
                "Title 01",
                "Description 02",
                "09/02/2023",
                R.drawable.haji6) );
        modelArrayList.add(new MyModel(
                "Title 01",
                "Description 02",
                "09/02/2023",
                R.drawable.haji7) );

        myAdapter = new MyAdapter(getContext(),modelArrayList);
        viewPager.setAdapter(myAdapter);
        viewPager.setPadding(100,0,100,0);



    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), BookingMain.class);
        startActivity(intent);
    }
}