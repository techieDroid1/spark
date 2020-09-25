package com.example.sparklive.ui.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.sparklive.R;
import com.example.sparklive.data.db.DatabaseInit;
import com.example.sparklive.data.db.entities.DataEntity;
import com.example.sparklive.databinding.ActivityImagesBinding;
import com.example.sparklive.ui.adapter.ItemsAdapter;

import java.util.ArrayList;
import java.util.List;

public class ImagesActivity extends AppCompatActivity {

    ActivityImagesBinding activityBinding;

    DatabaseInit db;
    ItemsAdapter adapter;
    List<DataEntity> expertsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityBinding = DataBindingUtil.setContentView(this, R.layout.activity_images);

        db = DatabaseInit.getInstance(this);
        expertsList = new ArrayList<>();

        initRecyclerView();
    }

    private void initRecyclerView(){
        new Thread(){
            @Override
            public void run() {
                super.run();
                expertsList = db.dataDao().getAllData();

                new Runnable(){
                    @Override
                    public void run() {
                        adapter = new ItemsAdapter(ImagesActivity.this, expertsList);
                        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                        activityBinding.rvExperts.setLayoutManager(layoutManager);
                        activityBinding.rvExperts.setAdapter(adapter);
                    }
                }.run();
            }
        }.start();
    }
}