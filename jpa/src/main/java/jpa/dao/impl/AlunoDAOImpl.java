package jpa.dao.impl;

import jpa.dao.HibernateGenericDAO;
import jpa.entity.Aluno;

public class AlunoDAOImpl extends HibernateGenericDAO<Aluno, Long>{

	private static AlunoDAOImpl instance = null;

	private AlunoDAOImpl() {
		super(Aluno.class);
	}

	public static AlunoDAOImpl getInstance() {
		if (instance == null) {
			instance = new AlunoDAOImpl();
		}
		return instance;
	}
}
