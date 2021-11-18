package main.java.br.com.bairrodevidro.controller;


import main.java.br.com.bairrodevidro.model.Login;
import main.java.br.com.bairrodevidro.model.LoginDoCliente;
import main.java.br.com.bairrodevidro.model.domain.Cadastro;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class LoginMB implements Serializable{

    private Cadastro cadastro = new Cadastro();

    @Inject
    private LoginDoCliente loginDoCliente = new LoginDoCliente();

    @PostConstruct
    public void init(){
        System.out.println(" Bean executado! ");
    }

    public void consultaLoginMB() throws IOException {
        loginDoCliente.consultaLogin(cadastro);
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
