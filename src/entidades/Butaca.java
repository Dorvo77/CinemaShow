package entidades;

public class Butaca {
    private String ubicacion;
    private char estado;

    public Butaca() {
        estado = ' ';
    }

    public Butaca(String ubicacion) {
        this.ubicacion = ubicacion;
        this.estado = ' ';
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return ubicacion+estado+" |";
    }
}
