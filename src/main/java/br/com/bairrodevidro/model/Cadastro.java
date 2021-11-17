package main.java.br.com.bairrodevidro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_cadastro;
	private String nome;
	private String sobrenome;
	private String email;
	private String cpf;
	private String senha;

	public Cadastro(int id_cadastro, String nome, String sobrenome, String email, String cpf, String senha){
		this.id_cadastro = id_cadastro;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.cpf = cpf;
		this.senha = senha;
	}

	public Cadastro(){

	}

	public int getId_cadastro() {
		return id_cadastro;
	}
	public void setId_cadastro(int id_cadastro) {
		this.id_cadastro = id_cadastro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
