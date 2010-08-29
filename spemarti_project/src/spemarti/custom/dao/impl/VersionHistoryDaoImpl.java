package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.VersionHistory;
import spemarti.custom.dao.TOBaseHibernateDao;
import spemarti.custom.dao.VersionHistoryDao;

public class VersionHistoryDaoImpl extends TOBaseHibernateDao<VersionHistory, String> implements VersionHistoryDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6048553260567323411L;

	private VersionHistoryDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(VersionHistory.class, sessionFactory);
	}
	
	public VersionHistoryDaoImpl(SessionFactory sessionFactory) {
		super(VersionHistory.class, sessionFactory);
	}
}
