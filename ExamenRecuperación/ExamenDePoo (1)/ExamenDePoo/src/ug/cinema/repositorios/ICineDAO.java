package ug.cinema.repositorios;

import java.util.List;

import ug.cinema.modelo.Cines;

public interface ICineDAO {
    Cines buscar(int codigo);

    List<Cines> consultarTodos();

    void insertar(Cines n);

    Cines[] listar();
}

