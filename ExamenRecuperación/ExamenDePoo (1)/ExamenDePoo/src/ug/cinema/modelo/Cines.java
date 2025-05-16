package ug.cinema.modelo;

public class Cines {
    private String cinema;
    private String ubicacion;

    public Cines() {
    }
    public Cines(String cinema, String ubicacion) {
        this.cinema = cinema;
        this.ubicacion = ubicacion;
    
    }
    public String getCinema() {
        return cinema;
    }
    public void setCinema(String cinema) {
        this.cinema = cinema;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    @Override
    public String toString() {
        return "Cine [cinema=" + cinema + ", ubicacion=" + ubicacion + "]";
    }
    
    
}
