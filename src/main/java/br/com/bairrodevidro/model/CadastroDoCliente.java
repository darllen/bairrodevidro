package main.java.br.com.bairrodevidro.model;

import main.java.br.com.bairrodevidro.model.domain.Cadastro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroDoCliente {

	public void criarCliente(Cadastro cadastro) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bairrodevidro");
		EntityManager em = emf.createEntityManager();

		Cadastro novoCadastro = new Cadastro();

		novoCadastro.setNome(cadastro.getNome());
		novoCadastro.setSobrenome(cadastro.getSobrenome());
		novoCadastro.setEmail(cadastro.getEmail());
		novoCadastro.setCpf(cadastro.getCpf());
		novoCadastro.setSenha(cadastro.getSenha());

		em.getTransaction().begin();
		em.persist(novoCadastro);
		em.getTransaction().commit();

		em.close();
	}

    public void consultarCliente (Cadastro cadastro) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bairrodevidro");
		EntityManager em = emf.createEntityManager();

		// (CLASSE ENTIDADE , VALOR DA PK)
		Cadastro usuario = em.find(Cadastro.class, 5);
		// COMO ESTOU SAO CONSULTANDO, NÃO PRECISA DE TRANSAÇÃO

		if (usuario != null) {
			System.out.println("Nome Completo: " + usuario.getNome() +" "+usuario.getSobrenome());
			System.out.println("E-mail: " + usuario.getEmail());
		} else {
			System.out.println("Usuário não encontrado!");
		}
		
		//em.close();
	}
    
    public void atualizarCliente (Cadastro cadastro) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bairrodevidroPU");
		EntityManager em = emf.createEntityManager();

		Cadastro usuario = em.find(Cadastro.class, 1);
		
		em.getTransaction().begin();
		
		usuario.setSobrenome("Laurentino");
		usuario.setSenha("madonna123");
		usuario.setEmail("pedrinho@hotmail.com");
		usuario.setCpf("85612247356");
		
		em.getTransaction().commit();
		
		System.out.println("Dados do usuário atualizados com sucesso!");

		//em.close();		
	}
    
    public void removerCliente (Cadastro cadastro) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bairrodevidroPU");
		EntityManager em = emf.createEntityManager();
		
		Cadastro usuario = em.find(Cadastro.class, 2);
		
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();
		
		System.out.println("Objeto removido com sucesso!");
		
		//em.close();		
	}
    
    
}
