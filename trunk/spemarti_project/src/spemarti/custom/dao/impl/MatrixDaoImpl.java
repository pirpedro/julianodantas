package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Matrix;
import spemarti.custom.dao.MatrixDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class MatrixDaoImpl extends TOBaseHibernateDao<Matrix, String> implements
		MatrixDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -546787150984120201L;

	@SuppressWarnings("rawtypes")
	private MatrixDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Matrix.class, sessionFactory);
	}

	public MatrixDaoImpl(SessionFactory sessionFactory) {
		super(Matrix.class, sessionFactory);
	}
}
