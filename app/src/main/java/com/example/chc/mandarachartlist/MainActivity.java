package com.example.chc.mandarachartlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private String[] myDataset = new String[5];
    private String[] myTitleset = new String[5];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Dummy Data Set
        // title
        myTitleset[0]= "data_01";
        myTitleset[1]= "data_02";
        myTitleset[2]= "data_03";
        myTitleset[3]= "data_04";
        myTitleset[4]= "data_05";
        // date
        myDataset[0] = "2017 01 01";
        myDataset[1] = "2017 02 01";
        myDataset[2] = "2017 03 01";
        myDataset[3] = "2017 04 01";
        myDataset[4] = "2017 05 01";

        mAdapter = new MyAdapter(myTitleset, myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
