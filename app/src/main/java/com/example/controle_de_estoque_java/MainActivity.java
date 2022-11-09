package com.example.controle_de_estoque_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.controle_de_estoque_java.activitys.CadActivity;
import com.example.controle_de_estoque_java.activitys.HomeActivity;

public class MainActivity extends AppCompatActivity {
    private final int TIPO_CRIACAO = 0;
    private final int TIPO_MODIFICACAO = 1;


    @Override
    protected void onStart() {
        super.onStart();
        Intent intent =new Intent(getApplicationContext(), HomeActivity.class);
        intent.putExtra("tipo",TIPO_CRIACAO);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}