package ug.cinema.negocios;

import java.util.List;

import ug.cinema.modelo.Pelis;

public interface IPeliculasFacade {
    boolean existe(int codigo);

    void guardar(Pelis cliente);

    void eliminar(Pelis cliente);

    List<Pelis> listarTodos();
}
