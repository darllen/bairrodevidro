package main.java.br.com.bairrodevidro.model;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Login {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int idLogin;
    private String email;
    private String senha;


    public Login (String email, int idLogin,  String senha){

      this.idLogin = idLogin;
        this.email = email;
        this.senha = senha;
    }

    public Login(){

    }

    public int getIdLogin() {
       return idLogin;
   }
    public void setIdLogin(int idLogin) {
       this.idLogin = idLogin;
   }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


}
