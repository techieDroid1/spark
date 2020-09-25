package com.example.sparklive.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sparklive.R;
import com.example.sparklive.data.db.DatabaseInit;
import com.example.sparklive.data.db.entities.DataEntity;
import com.example.sparklive.models.reponse.Result;
import com.example.sparklive.models.reponse.ResultResponse;
import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    DatabaseInit db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = DatabaseInit.getInstance(this);


        new Thread(){
            @Override
            public void run() {
                super.run();

                try {
                    if (db.dataDao().numberOfEntries() == 0){
                        InputStream is = getResources().openRawResource(R.raw.items);
                        Reader reader = new InputStreamReader(is, "UTF-8");
                        ResultResponse result  = new Gson().fromJson(reader, ResultResponse.class);

                        List<DataEntity> dataList = new ArrayList<>();

                        for (Result resultOne : result.getResults()){
                            DataEntity dataEntity = new DataEntity(
                                    resultOne.getTitle(),
                                    resultOne.getExpert().getProfilePic(),
                                    resultOne.getExpert().getName(),
                                    resultOne.getExpert().getShortBio(),
                                    resultOne.getThumbnail(),
                                    resultOne.getActionCounts().getClick().toString(),
                                    resultOne.getActionCounts().getLike().toString(),
                                    false,
                                    resultOne.getDescription(),
                                    resultOne.getPublishedAt()
                            );
                            dataList.add(dataEntity);
                        }
                        db.dataDao().insertAllData(dataList);
                    }


                    new Runnable(){
                        @Override
                        public void run() {
                            startActivity(new Intent(MainActivity.this, ImagesActivity.class));
                        }
                    }.run();

                } catch (UnsupportedEncodingException e) {
                    Log.i("TAG", "onCreate: ERROR");
                    e.printStackTrace();
                }
            }
        }.start();



    }
}