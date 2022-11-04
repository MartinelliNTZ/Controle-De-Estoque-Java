package com.example.controle_de_estoque_java.activitys;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.controle_de_estoque_java.R;
import com.example.controle_de_estoque_java.helpers.ProdutoDAO;
import com.example.controle_de_estoque_java.models.Produto;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class CadActivity extends AppCompatActivity {


    private TextInputEditText edtDescricao;
    private EditText edtQuantidade;
    private Button btCad;
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
        getSupportActionBar().hide();
        linkage();

    }
    private void linkage(){
        edtDescricao = findViewById(R.id.edtDescricao);
        edtQuantidade = findViewById(R.id.edtQuantidade);
        btCad = findViewById(R.id.btCad);
        btCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOk()) {
                    Produto produto = new Produto(edtDescricao.getText().toString(),
                            Integer.parseInt(edtQuantidade.getText().toString()));
                    ProdutoDAO produtoDAO = new ProdutoDAO(getApplicationContext());
                    produtoDAO.salvar(produto);
                }
            }
        });

    }
    private boolean isOk(){
        if (edtDescricao.getText().length() ==0 || edtQuantidade.getText().length() ==0) {
            return false;
        }else{
            return true;
        }
    }


}















