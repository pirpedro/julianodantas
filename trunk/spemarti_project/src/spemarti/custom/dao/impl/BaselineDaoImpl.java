package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Baseline;
import spemarti.custom.dao.BaselineDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class BaselineDaoImpl extends TOBaseHibernateDao<Baseline, String> implements BaselineDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8335919779511437844L;

	private BaselineDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Baseline.class, sessionFactory);
	}
	
	public BaselineDaoImpl(SessionFactory sessionFactory) {
		super(Baseline.class, sessionFactory);
	}
}
