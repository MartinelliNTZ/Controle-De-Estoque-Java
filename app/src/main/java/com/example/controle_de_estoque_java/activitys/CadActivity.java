package com.example.controle_de_estoque_java.activitys;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.example.controle_de_estoque_java.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class CadActivity extends AppCompatActivity {

    private SQLiteDatabase dados;
    private TextInputEditText edtNome;
    private String nome;
    private Button btCad;
    private final String NOME_DATABASE = "usuarios";
    private ArrayList<String> resultado;
    private boolean edicao;


    @Override
    protected void onResume() {
        super.onResume();
       // listarDados();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad);
        edtNome = findViewById(R.id.edtNome);
        btCad = findViewById(R.id.btCad);
        getSupportActionBar().hide();





    }


}















