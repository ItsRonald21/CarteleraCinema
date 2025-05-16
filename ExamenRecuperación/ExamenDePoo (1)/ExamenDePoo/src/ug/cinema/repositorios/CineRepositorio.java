package ug.cinema.repositorios;

import java.util.ArrayList;
import java.util.List;

import ug.cinema.modelo.Cines;

public class CineRepositorio implements ICineDAO{

    List<Cines> cineRepositorio;

    public CineRepositorio() {
        this.cineRepositorio = new ArrayList<>();

        cineRepositorio.add(new Cines("Supercines", "9 De octubre"));
        cineRepositorio.add(new Cines("CineMalecón", "Malecón 2000"));
        cineRepositorio.add(new Cines("Multicines", "Mall del Río"));
    }   
    @Override
    public Cines buscar(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public List<Cines> consultarTodos() {
        return cineRepositorio;
    }

    @Override
    public void insertar(Cines n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public Cines[] listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }
    
}
