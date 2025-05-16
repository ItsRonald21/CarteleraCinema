package ug.cinema.negocios;

import java.util.List;

import ug.cinema.modelo.Cines;

public interface ICineFacade {
    boolean existe(int codigo);

    void guardar(Cines cliente);

    void eliminar(Cines cliente);

    List<Cines> listarTodos();
}
