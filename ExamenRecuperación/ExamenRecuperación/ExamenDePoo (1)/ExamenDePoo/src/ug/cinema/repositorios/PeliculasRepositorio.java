package ug.cinema.repositorios;

import java.util.ArrayList;
import java.util.List;
import ug.cinema.modelo.Pelis;

public class PeliculasRepositorio implements IPeliculasDAO {

    // Lista para almacenar las películas
    List<Pelis> PeliculasListaRepositorio;

    // Constructor para inicializar la lista
    public PeliculasRepositorio() {
        this.PeliculasListaRepositorio = new ArrayList<>();

        PeliculasListaRepositorio.add(new Pelis("IRONMAN 3", "Sala-1 2D", "16H00\n18H00\n20H00", "28 DE AGOSTO AL 03 DE SEPTIEMBRE", 4.00));
        PeliculasListaRepositorio.add(new Pelis("BLUE BLEETLE", "Sala-2 2D", "13H00\n15H00", "28 DE AGOSTO AL 03 DE SEPTIEMBRE", 4.00));
        PeliculasListaRepositorio.add(new Pelis("MAVERICK", "Sala-3 VIP", "17H00", "28 DE AGOSTO AL 03 DE SEPTIEMBRE", 8.00));
        PeliculasListaRepositorio.add(new Pelis("OPENHEIMER", "Sala-4 3D", "13H00\n15H00\n17H00\n19H00", "28 DE AGOSTO AL 03 DE SEPTIEMBRE", 6.00));
        PeliculasListaRepositorio.add(new Pelis("TRANSFORMERS", "Sala-5 IMAX", "13H00\n15H00\n17H00", "28 DE AGOSTO AL 03 DE SEPTIEMBRE", 8.50));
    }

    @Override
    public Pelis buscar(int codigo) {
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public List<Pelis> consultarTodos() {
        return PeliculasListaRepositorio;
    }

    @Override
    public void insertar(Pelis n) {
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public Pelis[] listar() {
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }
}
