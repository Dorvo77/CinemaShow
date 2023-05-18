package entidades;

public class Cliente {
    private String nombre;
    private Integer edad;
    private Double dinero;

    public Cliente() {
    }

    public Cliente(String nombre, Integer edad, Double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dinero=" + dinero +
                '}';
    }
}
