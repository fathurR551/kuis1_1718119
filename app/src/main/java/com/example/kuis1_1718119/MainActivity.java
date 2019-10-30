package com.example.kuis1_1718119;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity  extends AppCompatActivity {

    private RecyclerView recyclerView;
    private keluargaAdapter keluargaAdapter;
    private ArrayList<keluarga>keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        keluargaAdapter = new keluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluargaAdapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Didik", "Ayah",  getDrawable(R.drawable.a1)));
        keluargaArrayList.add(new keluarga("Erin", "Ibu", getDrawable(R.drawable.a2)));
        keluargaArrayList.add(new keluarga("Agus", "Anak Pertama", getDrawable(R.drawable.a3)));
        keluargaArrayList.add(new keluarga("Agung Dwi F", "Anak Kedua", getDrawable(R.drawable.a4)));
    }
}