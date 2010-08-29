<<<<<<< .mine
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Configuration;
import spemarti.custom.dao.ConfigurationDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ConfigurationDaoImpl extends TOBaseHibernateDao<Configuration, String> implements ConfigurationDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4655210778705332346L;

	private ConfigurationDaoImpl(Class<?> objectClass, SessionFactory sessionFactory) {
		super(Configuration.class, sessionFactory);
	}
	
	public ConfigurationDaoImpl(SessionFactory sessionFactory) {
		super(Configuration.class, sessionFactory);
	}
}
=======
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Configuration;
import spemarti.custom.dao.ConfigurationDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ConfigurationDaoImpl extends TOBaseHibernateDao<Configuration, String> implements ConfigurationDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4655210778705332346L;

	private ConfigurationDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Configuration.class, sessionFactory);
	}
	
	public ConfigurationDaoImpl(SessionFactory sessionFactory) {
		super(Configuration.class, sessionFactory);
	}
}
>>>>>>> .r19
