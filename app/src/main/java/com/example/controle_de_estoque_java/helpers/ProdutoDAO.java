package com.example.controle_de_estoque_java.helpers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.controle_de_estoque_java.models.Produto;
import com.example.controle_de_estoque_java.my_codes.IModelDAO;

import java.util.List;

public class ProdutoDAO implements IModelDAO<Produto> {
    private SQLiteDatabase escreve;
    private SQLiteDatabase le;

    public ProdutoDAO(Context context) {
        DbHelper dbHelper = new DbHelper(context);
        this.escreve = dbHelper.getWritableDatabase();
        le = dbHelper.getReadableDatabase();
    }

    @Override
    public boolean salvar(Produto produto) {
        try{
            ContentValues cv = new ContentValues();
            cv.put("descricao",produto.getDescricao());
            cv.put("quantidade",(produto.getQuantidade()));

            escreve.insert( DbHelper.TABELA_PRODUTOS,null,cv);
            Log.i("INFO COX","Jogo "+produto.getDescricao()+" criado com Sucesso." + cv);

            return  true;
        }catch (Exception e) {
            Log.i("INFO COX","ERRO ao salvar dados. COD: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean atualizar(Produto produto) {
        return false;
    }

    @Override
    public boolean deletar(Produto produto) {
        return false;
    }

    @Override
    public List<Produto> listar() {
        return null;
    }
}
