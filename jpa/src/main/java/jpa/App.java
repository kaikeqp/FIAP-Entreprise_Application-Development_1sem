package jpa;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import jpa.dao.PersistenceManager;
import jpa.dao.impl.DisciplinaDAOImpl;
import jpa.entity.Aluno;
import jpa.entity.Disciplina;
import jpa.service.impl.AlunoServiceImpl;
import jpa.service.impl.DisciplinaServiceImpl;

public class App {

	public static void main(String[] args) {
		AlunoServiceImpl alunoService = AlunoServiceImpl.getInstance();
		DisciplinaServiceImpl disciplinaService = DisciplinaServiceImpl.getInstance();

		//AlunoDAOImpl dao = AlunoDAOImpl.getInstance();
		
		//Aluno a0 = new Aluno("Kaike Santana", "rm88473", "23490343222", LocalDate.of(2000, 2, 17));
		//Aluno a1 = new Aluno("Mauricio", "rm88352", "01058789878", LocalDate.of(2002, 3, 20));
		//Aluno a2 = new Aluno("Leticia", "rm846382", "78954823501", LocalDate.of(2001, 8, 8));
		//Aluno a3 = new Aluno("Kaike Santana", "rm36742", "00011122233", LocalDate.of(2000, 2, 17));

		//a3.setNome("Godiniz");
		//dao.atualizar(a3, entityManager);
		//dao.inserir(a1, entityManager);
		//dao.inserir(a2, entityManager);
		//dao.remover(35L, entityManager);
		
		//dao.listar(entityManager).forEach(System.out::println);
		
		/**
		 * DISCIPLINA
		 */
		
		/**
		Disciplina d0 =  new Disciplina("Java", 120);
		Disciplina d1 =  new Disciplina("Angular", 80);
		Disciplina d2 =  new Disciplina("C#", 120);
		
		disciplinaService.cadastrar(d0);
		disciplinaService.cadastrar(d1);
		disciplinaService.cadastrar(d2);
		
		disciplinaService.listar().forEach(System.out::println);
		
		d1.setNome("Angular 10");
		disciplinaService.atualizar(d1);
		disciplinaService.listar().forEach(System.out::println);

		disciplinaService.remover(d2.getId());*/
		
		System.out.println("=========================================");
		
		//Aluno a0 = new Aluno("Alice", "rm77483", "222.535.866-21", LocalDate.of(2004, 12, 25));
		Aluno a1 = new Aluno("Maria", "rm22343", "374.234.623-34", LocalDate.of(2006, 04, 01));
		Aluno a2 = new Aluno("Júlia", "rm83492", "123.245.756-00", LocalDate.of(2005, 11, 28));
		Aluno a3 = new Aluno("Thalita", "rm83422", "444.324.222-01", LocalDate.of(2003, 05, 22));

		//alunoService.cadastrar(a0);
		alunoService.cadastrar(a1);
		alunoService.cadastrar(a2);
		alunoService.cadastrar(a3);
		
		alunoService.listar().forEach(System.out::println);


	}
}
