package jpa.service.impl;

import java.util.List;

import jpa.dao.impl.AlunoDAOImpl;
import jpa.entity.Aluno;
import jpa.service.GenericService;

public class AlunoServiceImpl extends GenericService<Aluno, Long> {

	private static AlunoServiceImpl instance = null;

	private AlunoDAOImpl AlunoDAO;

	private AlunoServiceImpl() {
		AlunoDAO = AlunoDAOImpl.getInstance();
	}

	public static AlunoServiceImpl getInstance() {
		if (instance == null) {
			instance = new AlunoServiceImpl();
		}
		return instance;

	}

	@Override
	public void cadastrar(Aluno entidade) {
		try {
			AlunoDAO.inserir(entidade, getEntityManager());
		} catch (Exception e) {
			getEntityManager().getTransaction().rollback();
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
	}

	@Override
	public void atualizar(Aluno entidade) {
		try {
			AlunoDAO.atualizar(entidade, getEntityManager());
		} catch (Exception e) {
			getEntityManager().getTransaction().rollback();
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
	}

	@Override
	public void remover(Long id) {
		try {
			AlunoDAO.remover(id, getEntityManager());
		} catch (Exception e) {
			getEntityManager().getTransaction().rollback();
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
	}

	@Override
	public Aluno obter(Long id) {
		Aluno aluno = null;
		try {
			aluno = AlunoDAO.obterPorId(id, getEntityManager());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
		return aluno;
	}

	@Override
	public List<Aluno> listar() {
		List<Aluno> alunos = null;
		try {
			alunos = AlunoDAO.listar(getEntityManager());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
		return alunos;
	}

}
