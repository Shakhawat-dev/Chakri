package com.metacoders.cakri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bank_job_special extends AppCompatActivity {

    TextView bottomText ;
    CardView adviceBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_job_special);

        bottomText = findViewById(R.id.page_bottom_textView);
        bottomText.setText("★ব্যাংক লিখিত প্রস্তুতির সাজেশন দেখুন★");
    }


}