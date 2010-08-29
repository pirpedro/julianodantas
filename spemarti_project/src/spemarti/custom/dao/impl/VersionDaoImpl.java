package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Version;
import spemarti.custom.dao.TOBaseHibernateDao;
import spemarti.custom.dao.VersionDao;

public class VersionDaoImpl extends TOBaseHibernateDao<Version, String> implements VersionDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2974002063134534217L;

	private VersionDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Version.class, sessionFactory);
	}
	
	public VersionDaoImpl(SessionFactory sessionFactory) {
		super(Version.class, sessionFactory);
	}

}
