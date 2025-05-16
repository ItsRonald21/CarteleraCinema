package ug.cinema.repositorios;

import java.util.List;

import ug.cinema.modelo.Pelis;

public interface IPeliculasDAO {
    Pelis buscar(int codigo);

    List<Pelis> consultarTodos();

    void insertar(Pelis n);

    Pelis[] listar();
}
