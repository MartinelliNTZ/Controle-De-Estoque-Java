package com.example.controle_de_estoque_java.helpers;

import com.example.controle_de_estoque_java.models.Produto;
import com.example.controle_de_estoque_java.my_codes.IModelDAO;

import java.util.List;

public class ProdutoDAO implements IModelDAO<Produto> {

    @Override
    public boolean salvar(Produto produto) {
        return false;
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
