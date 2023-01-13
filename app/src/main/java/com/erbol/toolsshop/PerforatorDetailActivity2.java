package com.erbol.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PerforatorDetailActivity2 extends AppCompatActivity {
         private TextView perforatorTitle;
         private TextView perforatorInfo;
         private ImageView imageViewPerforator1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perforator_detail2);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        perforatorTitle=findViewById(R.id.PerforatorTitle);
        perforatorInfo=findViewById(R.id.PerforatorInfo);
        imageViewPerforator1 = findViewById(R.id.imageViewMTS);
        Intent intent=getIntent();

        if(intent. hasExtra("title")&& intent. hasExtra("info")&& intent. hasExtra("resId")){
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            int resId=intent.getIntExtra("resId",-1);
            perforatorTitle.setText(title);
            perforatorInfo.setText(info);
            imageViewPerforator1.setImageResource(resId);
        }
        else{
            Intent backToCategory= new Intent(this, DrillCategoryActivity.class);
            startActivity(backToCategory);
        }

    }
}