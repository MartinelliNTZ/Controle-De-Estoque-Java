package com.example.controle_de_estoque_java.my_codes;

import java.util.List;

public interface IModelDAO<T> {
        /**Método que salva o objeto selecionado no SQLite*/
        public boolean salvar(T t);
        /**Método que atualiza o objeto selecionado no SQLite*/
        public boolean atualizar(T t);
        /**Método que deleta o objeto selecionado no SQLite*/
        public boolean deletar(T t);
        /**Método que retorna uma lista dos objetos armazenados no SQLite*/
        public List<T> listar();

}
