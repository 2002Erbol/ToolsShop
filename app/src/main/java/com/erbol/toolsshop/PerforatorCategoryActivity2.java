package com.erbol.toolsshop;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PerforatorCategoryActivity2 extends AppCompatActivity {
private ListView listViewPerf;
private List<Perforator> perforatorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        setContentView(R.layout.activity_perforator_category2);

        perforatorList = new ArrayList<>();
        perforatorList.add(new Perforator(getString( R.string.mts_title),getString(R.string.mts_info),R.drawable.mts));
        perforatorList.add(new Perforator(getString(R.string.BOSCH_title),getString(R.string.bosch_info),R.drawable.boch));
        perforatorList.add(new Perforator((getString(R.string.CROWN_title)),getString(R.string.crown_info),R.drawable.crown));
        listViewPerf = findViewById(R.id.ListViewPerf);
        ArrayAdapter<Perforator>adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,perforatorList);
        listViewPerf.setAdapter(adapter);


        listViewPerf.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position , long l) {
                Perforator perforator= perforatorList.get(position);
                Intent intent = new Intent(getApplicationContext(),PerforatorDetailActivity2.class);
                intent.putExtra("title",perforator.getTitle());
                intent.putExtra("info",perforator.getInfo());
                intent.putExtra("resId",perforator.getResId());
                startActivity(intent);
            }
        });
    }
}