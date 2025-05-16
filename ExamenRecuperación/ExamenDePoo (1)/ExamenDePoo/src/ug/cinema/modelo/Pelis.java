package ug.cinema.modelo;

public class Pelis {
    private String nombre;    
    private String sala;     
    private String horario;   
    private String vigencia;  
    private Double precio;   

    // Constructor vacio
    public Pelis() {
    }

    // Constructor
    public Pelis(String nombre, String sala, String horario,String vigencia, Double precio) {
        this.nombre = nombre;
        this.sala = sala;
        this.horario = horario;
        this.precio = precio;
        this.vigencia = vigencia; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pelicula [nombre=" + nombre + ", sala=" + sala + ", horario=" + horario + ", precio=" + precio + "]";
    }

    public Object getCine() {
        return null;
    }



    
    
}
