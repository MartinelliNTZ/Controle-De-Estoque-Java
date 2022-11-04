package com.example.controle_de_estoque_java.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public static int VERSION= 1;
    public static String NOME_DB= "DB_MAQUININHA_BI2";
    public static String TABELA_PRODUTOS= "produto";
    private SQLiteDatabase sqLiteDatabasee;

    public DbHelper(@Nullable Context context ) {
        super(context, NOME_DB, null, VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        this.sqLiteDatabasee = sqLiteDatabase;
        criarProdutos();
    }//Método chamado uma unica vez na criacao do app

    /**Método que cria a tabela de produtos*/
    private void criarProdutos(){
        String sql = "CREATE TABLE IF NOT EXISTS " +
                TABELA_PRODUTOS +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "quantidade INTEGER NOT NULL," +
                "descricao TEXT NOT NULL);";


        try {
            sqLiteDatabasee.execSQL(sql);
            Log.i("INFO DB COX","Sucesso ao criar tabela:  "+TABELA_PRODUTOS);
        }catch(Exception e){
            Log.i("INFO DB COX","ERRO ao criar tabela:  "+ TABELA_PRODUTOS+" "+e.getMessage());
        }
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }//método ultilizado na atualizacao dos dados
}