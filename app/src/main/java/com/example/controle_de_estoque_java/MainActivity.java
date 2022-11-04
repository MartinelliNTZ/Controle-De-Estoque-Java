package com.example.controle_de_estoque_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.controle_de_estoque_java.activitys.CadActivity;
import com.example.controle_de_estoque_java.activitys.HomeActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onStart() {
        super.onStart();
        startActivity(new Intent(getApplicationContext(), CadActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}