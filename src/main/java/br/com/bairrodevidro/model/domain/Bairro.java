package main.java.br.com.bairrodevidro.model.domain;


import javax.persistence.*;

@Entity
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_bairro;
    private String nomeBairro;



    public int getId_bairro() {
        return id_bairro;
    }

    public void setId_bairro(int id_bairro) {
        this.id_bairro = id_bairro;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }
}
