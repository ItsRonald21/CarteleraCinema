package ug.cinema.negocios;

import java.util.List;

import javafx.util.StringConverter;
import ug.cinema.modelo.Pelis;

public class PeliculasFacade extends StringConverter<Pelis> implements IPeliculasFacade {

    @Override
    public String toString(Pelis pelicula) {
        return pelicula == null ? "" : pelicula.getSala(); //parte del combobox de sala
    }

    @Override
    public Pelis fromString(String string) {
        return null;
    }


    @Override
    public boolean existe(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existe'");
    }

    @Override
    public void guardar(Pelis cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardar'");
    }

    @Override
    public void eliminar(Pelis cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<Pelis> listarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    
}
