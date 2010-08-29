package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Configuration;
import spemarti.custom.dao.ConfigurationDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class ConfigurationDaoImpl extends
		TOBaseHibernateDao<Configuration, String> implements ConfigurationDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4655210778705332346L;

	@SuppressWarnings("rawtypes")
	private ConfigurationDaoImpl(Class objectClass,
			SessionFactory sessionFactory) {
		super(Configuration.class, sessionFactory);
	}

	public ConfigurationDaoImpl(SessionFactory sessionFactory) {
		super(Configuration.class, sessionFactory);
	}
}
