import java.time.LocalDate;

public class Propuesta {
    private int id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaFin;
    private boolean activa;
    private int idCreador;

    public Propuesta() {

    }

    public Propuesta(int id, String titulo, String descripcion, LocalDate fechaFin, boolean activa, int idCreador) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaFin = fechaFin;
        this.activa = activa;
        this.idCreador = idCreador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getIdCreador() {
        return idCreador;
    }

    public void setIdCreador(int idCreador) {
        this.idCreador = idCreador;
    }

    @Override
    public String toString() {
        return "Propuesta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaFin=" + fechaFin +
                ", activa=" + activa +
                ", idCreador=" + idCreador +
                '}';
    }
}
