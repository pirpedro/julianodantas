package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Session;
import spemarti.custom.dao.SessionDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class SessionDaoImpl extends TOBaseHibernateDao<Session, String>
		implements SessionDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8800685478984377490L;

	@SuppressWarnings("rawtypes")
	private SessionDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Session.class, sessionFactory);
	}

	public SessionDaoImpl(SessionFactory sessionFactory) {
		super(Session.class, sessionFactory);
	}
}
