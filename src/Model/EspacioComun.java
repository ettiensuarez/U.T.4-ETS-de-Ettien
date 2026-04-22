package Model;

public class EspacioComun {
    private int id;
    private int nombre;
    private String descripcion;
    private int capacidad;
    private boolean disponible;

    public EspacioComun() {
    }

    public EspacioComun(int id, int nombre, String descripcion, int capacidad, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "EspacioComun{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", descripcion='" + descripcion + '\'' +
                ", capacidad=" + capacidad +
                ", disponible=" + disponible +
                '}';
    }
}
