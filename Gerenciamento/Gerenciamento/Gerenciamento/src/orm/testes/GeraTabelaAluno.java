package orm.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//classe responsável pelo DDL no banco
//relativo a classe Tarefa
public class GeraTabelaAluno {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		factory.close();
	}
	

}
