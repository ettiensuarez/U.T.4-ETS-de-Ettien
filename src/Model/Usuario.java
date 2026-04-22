package Model;

import Model.Enum.RolUsuario;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String passwordHash;
    private RolUsuario rol;
    private boolean activo;
    private LocalDate fechaRegistro;

    public Usuario() {
    }

    public Usuario(int id,String nombre ,String email, String passwordHash, RolUsuario rol, boolean activo, LocalDate fechaRegistro) {
        this.id = id;
        this.nombre=nombre;
        this.email = email;
        this.passwordHash = passwordHash;
        this.rol = rol;
        this.activo = activo;
        this.fechaRegistro = fechaRegistro;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public RolUsuario getRol() {
        return rol;
    }

    public boolean isActivo(){
        return activo;
    }
    public void setActivo(boolean activo){
        this.activo=activo;

    }
    public void setRol(RolUsuario rol){
    this.rol=rol;
    }
}
