package jpa.dao.impl;

import jpa.dao.HibernateGenericDAO;
import jpa.entity.Disciplina;

public class DisciplinaDAOImpl extends HibernateGenericDAO<Disciplina, Long>{

	private static DisciplinaDAOImpl instance = null;
	
	public DisciplinaDAOImpl() {
		super(Disciplina.class);
	}

	public static DisciplinaDAOImpl getInstance() {
		if (instance == null) {
			instance = new DisciplinaDAOImpl();
		}
		return instance;
	}
}
