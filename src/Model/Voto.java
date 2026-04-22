package Model;

import Model.Enum.TipoVoto;

public class Voto {
    private int id;
    private int idUsuario;
    private int idPropuesta;
    private TipoVoto tipoVoto;

    public Voto() {
    }

    public Voto(int id, int idUsuario, int idPropuesta, TipoVoto tipoVoto) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idPropuesta = idPropuesta;
        this.tipoVoto = tipoVoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPropuesta() {
        return idPropuesta;
    }

    public void setIdPropuesta(int idPropuesta) {
        this.idPropuesta = idPropuesta;
    }

    public TipoVoto getTipoVoto() {
        return tipoVoto;
    }

    public void setTipoVoto(TipoVoto tipoVoto) {
        this.tipoVoto = tipoVoto;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idPropuesta=" + idPropuesta +
                ", tipoVoto=" + tipoVoto +
                '}';
    }
}
