package com.example.examproekt;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exampleproject_injava.activity.adapter.CustomAdapter;
import com.example.exampleproject_injava.activity.listener.onBottomReachedListener;
import com.example.exampleproject_injava.activity.model.Friendly;

import java.util.ArrayList;
import java.util.List;

public class BestCars extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    int positions = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        List<BestCars> members = prepareMemerList();

        refreshAdapter(members);
    }

    private List<BestCars> prepareMemerList() {
        List<BestCars> members = new ArrayList<>();
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo1));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo2));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo3));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo4));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo5));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo6));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo7));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo8));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo9));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo10));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo11);
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo12));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo13));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo14));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo15));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo16));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo17));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo18));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo19));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo20));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo21));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo22));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo23));
            members.add(new BestCars("zorku" , "manga yoqadide shu" ,R.drawable.photo24));

        return members;
    }

    private void refreshAdapter(List<BestCars> members) {
        CustomAdapter adapter = new CustomAdapter(members,context,new onBottomReachedListener(){

            @Override
            public void onBottomReached(int position) {
                Log.d("@@@","@@@position"+position);
            }
        });


        recyclerView.setAdapter(adapter);
    }

    private void initView() {
        context = this;
        recyclerView = findViewById(R.id.recyclerView);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        } else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        }
    }

}