package com.example.recyclerview_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<SinhVien> sinhVienArrayList;
    SinhVienAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        sinhVienArrayList = new ArrayList<SinhVien>();



        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new SinhVienAdapter(this, sinhVienArrayList);
        recyclerView.setAdapter(adapter);
        Add();
    }

    private void Add(){
       for ( int i = 1; i < 100; i++ ){
           sinhVienArrayList.add(new SinhVien("trung" + i, "quang nam", 2000 ));

       }
    }

}
