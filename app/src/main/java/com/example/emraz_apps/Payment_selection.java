package com.example.emraz_apps;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Payment_selection extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_select);

        //intit views
        LinearLayout ll = (LinearLayout) findViewById(R.id.firstLayout);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        //create the listener for radio group
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //check if the choice-1 is selected
                if (radioGroup.getCheckedRadioButtonId() == R.id.radio_button_choice1) {
                    //show image wen select choice-1
                    ll.setVisibility(View.VISIBLE);
                } else {
                    //hide image when choice-1 not selected
                    ll.setVisibility(View.GONE);
                }
            }
        });
    }

}
