package jpa.service.impl;

import java.util.List;

import jpa.dao.impl.DisciplinaDAOImpl;
import jpa.entity.Disciplina;
import jpa.service.GenericService;

public class DisciplinaServiceImpl extends GenericService<Disciplina, Long> {

	private static DisciplinaServiceImpl instance = null;

	private DisciplinaDAOImpl disciplinaDAO;

	private DisciplinaServiceImpl() {
		disciplinaDAO = DisciplinaDAOImpl.getInstance();
	}

	public static DisciplinaServiceImpl getInstance() {
		if (instance == null) {
			instance = new DisciplinaServiceImpl();
		}
		return instance;
	}

	@Override
	public void cadastrar(Disciplina entidade) {
		try {
			disciplinaDAO.inserir(entidade, getEntityManager());

		} catch (Exception e) {
			getEntityManager().getTransaction().rollback();
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
	}

	@Override
	public void atualizar(Disciplina entidade) {
		try {
			disciplinaDAO.inserir(entidade, getEntityManager());

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
			disciplinaDAO.remover(id, getEntityManager());

		} catch (Exception e) {
			getEntityManager().getTransaction().rollback();
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
	}

	@Override
	public Disciplina obter(Long id) {
		Disciplina disciplina = null;
		try {
			disciplina = disciplinaDAO.obterPorId(id, getEntityManager());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}
		return disciplina;
	}

	@Override
	public List<Disciplina> listar() {
		List<Disciplina> disciplinas = null;
		try {
			disciplinas = disciplinaDAO.listar(getEntityManager());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeEntityManager();
		}

		return disciplinas;
	}

}
