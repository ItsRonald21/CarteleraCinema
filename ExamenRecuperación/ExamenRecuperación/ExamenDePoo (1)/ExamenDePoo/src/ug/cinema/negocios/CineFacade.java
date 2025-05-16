package ug.cinema.negocios;
import java.util.List;

import javafx.util.StringConverter;
import ug.cinema.modelo.Cines;

public class CineFacade extends StringConverter<Cines> implements ICineFacade{

        // ? Para que se sirva en el combo box
        @Override
        public String toString(Cines persona) {
            return persona == null ? "" : persona.getCinema();
        }
    
        @Override
        public Cines fromString(String string) {
            return null;
        }

    @Override
    public boolean existe(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existe'");
    }

    @Override
    public void guardar(Cines cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardar'");
    }

    @Override
    public void eliminar(Cines cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<Cines> listarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    
}
