package main.java.br.com.bairrodevidro.model;

import main.java.br.com.bairrodevidro.model.domain.Cadastro;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.*;
import java.io.IOException;

public class LoginDoCliente {



    public Cadastro consultaLogin(Cadastro cadastro) throws IOException {



        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bairrodevidro");
        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin();

           Cadastro cadastro1 = (Cadastro) em
                   .createQuery("SELECT u from Cadastro u where u.email = :email and u.senha = :senha")
                    .setParameter("email", cadastro.getEmail())
                    .setParameter("senha", cadastro.getSenha()).getSingleResult();
            redirecione();
            System.out.println("Usuário  encontrado!");

            return cadastro1;

        } catch (NoResultException e) {

            System.out.println("Usuário não encontrado!");
            return null;
        }
    }


    // Regra de negocio
    public void redirecione () throws IOException {
        String url = "http://localhost:8080/bairrodevidro/home.jsf";
        FacesContext.getCurrentInstance().getExternalContext().redirect(url);

    }


}

