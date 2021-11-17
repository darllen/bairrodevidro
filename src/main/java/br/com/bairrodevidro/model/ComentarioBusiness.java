package main.java.br.com.bairrodevidro.model;


import main.java.br.com.bairrodevidro.model.domain.Comentario;

import javax.persistence.*;
import java.io.IOException;
import java.util.ArrayList;


public class ComentarioBusiness {
    @PersistenceContext
    public void criarComentario (Comentario opiniao) throws IOException {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bairrodevidro");
        EntityManager em = emf.createEntityManager();

        Comentario novaOpiniao = new Comentario();

        novaOpiniao.setIdComentario(opiniao.getIdComentario());
        novaOpiniao.setComentario(opiniao.getComentario());
        novaOpiniao.setIdUsuario(opiniao.getIdUsuario());
        novaOpiniao.setIdBairro(opiniao.getIdBairro());
        novaOpiniao.setIdBairro(opiniao.getIdBairro());
        novaOpiniao.setTipo(opiniao.getTipo());

        em.getTransaction().begin();
        em.persist(novaOpiniao);
        em.getTransaction().commit();

        em.close();

    }

    public ArrayList<Comentario> listaComentario() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bairrodevidro");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            ArrayList<Comentario> listarComentario = (ArrayList<Comentario>) em
                    .createQuery("SELECT u from Comentario u", Comentario.class).getResultList();
//                    .createQuery("SELECT u from Comentario u where u.idBairro = :idBairro and u.tipo = :tipo" ,Comentario.class)
//                    .setParameter("idBairro", comentario.getBairro())
//                    .setParameter("tipo", comentario.getTipo()).getResultList();

            System.out.println(listarComentario);
            return listarComentario;

        } catch (NoResultException e) {
            System.out.println("Comentário não encontrado!");
            return null;
        }
        //em.close();


    }


}


