package com.example.emraz_apps;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyAdapter extends PagerAdapter {

    private Context context;
    private ArrayList<MyModel> modelArrayList;

    public MyAdapter(Context context, ArrayList<MyModel> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @Override
    public int getCount() {
        return modelArrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(R.layout.card_item,container,false);
        ImageView bannerIv = view.findViewById(R.id.bannerIv);
        TextView tittleTv = view.findViewById(R.id.tittleTv);
        TextView DescriptionTv = view.findViewById(R.id.desc);
        TextView dateTv = view.findViewById(R.id.dateTv);

        MyModel model =modelArrayList.get(position);
        String tittle = model.tittle;
        String descS = model.description;
        String date = model.date;
        int image = model.image;

        bannerIv.setImageResource(image);
        tittleTv.setText(tittle);
        DescriptionTv.setText(descS);
        dateTv.setText(date);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), BookingMain.class);
                view.getContext().startActivity(intent);
            }
        });

        //add view to container
        container.addView(view,position);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
