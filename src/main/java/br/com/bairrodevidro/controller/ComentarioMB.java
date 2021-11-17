package main.java.br.com.bairrodevidro.controller;

import main.java.br.com.bairrodevidro.model.ComentarioBusiness;
import main.java.br.com.bairrodevidro.model.domain.Comentario;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ManagedBean
@RequestScoped
public class ComentarioMB implements Serializable {

    private Comentario comentario = new Comentario();

    private ArrayList<Comentario> listaComentarios = new ArrayList<Comentario>();

    private ComentarioBusiness comentarioBusiness = new ComentarioBusiness();

    @PostConstruct
    public void init() {
        this.listaComentarios = comentarioBusiness.listaComentario();
        System.out.println("Bean executado!");
    }


    public void addcoment() throws IOException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Map<String,String> params = facesContext.getExternalContext().getRequestParameterMap();
        String tipoComentario = params.get("tipo");
        comentario.setTipo(tipoComentario);
        comentario.setIdBairro("BV");
        comentarioBusiness.criarComentario(comentario);
    }

    public List<Comentario> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(ArrayList<Comentario> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public ComentarioBusiness getComentarioBusiness() {
        return comentarioBusiness;
    }

    public void setComentarioBusiness(ComentarioBusiness comentarioBusiness) {
        this.comentarioBusiness = comentarioBusiness;
    }
}

