package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.List;
import spemarti.custom.dao.ListDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ListDaoImpl extends TOBaseHibernateDao<List, String> implements
		ListDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3334089954996496632L;

	private ListDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(List.class, sessionFactory);
	}

	public ListDaoImpl(SessionFactory sessionFactory) {
		super(List.class, sessionFactory);
	}
}
