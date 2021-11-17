package main.java.br.com.bairrodevidro.model.domain;

import javax.persistence.*;

@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idComentario;


    @Column(nullable = true)
    private String idUsuario;
    private String idBairro;
    private String tipo;
    private String comentario;


    public Comentario(String comentario, String idUsuario, int idComentario, String idBairro, String tipo) {
        this.comentario = comentario;
        this.idUsuario = idUsuario;
        this.idBairro = idBairro;
        this.tipo = tipo;
        this.idComentario = idComentario;
    }

    public Comentario() {

    }


    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(String idBairro) {
        this.idBairro = idBairro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
