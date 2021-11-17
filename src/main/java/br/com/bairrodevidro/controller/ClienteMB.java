package main.java.br.com.bairrodevidro.controller;

import main.java.br.com.bairrodevidro.model.Cadastro;
import main.java.br.com.bairrodevidro.model.CadastroDoCliente;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class ClienteMB implements Serializable {

    private Cadastro cadastro = new Cadastro();

    @Inject
    private CadastroDoCliente cadastroDoCliente = new CadastroDoCliente();

    @PostConstruct
    public void init(){
        System.out.println(" Bean executado! ");
    }

    public void add() {
        cadastroDoCliente.criarCliente(cadastro);
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
