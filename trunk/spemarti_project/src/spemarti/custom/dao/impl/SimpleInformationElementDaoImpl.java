package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.SimpleInformationElement;
import spemarti.custom.dao.SimpleInformationElementDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class SimpleInformationElementDaoImpl extends
		TOBaseHibernateDao<SimpleInformationElement, String> implements
		SimpleInformationElementDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3294988171128332732L;

	@SuppressWarnings("rawtypes")
	private SimpleInformationElementDaoImpl(Class objectClass,
			SessionFactory sessionFactory) {
		super(SimpleInformationElement.class, sessionFactory);
	}

	public SimpleInformationElementDaoImpl(SessionFactory sessionFactory) {
		super(SimpleInformationElement.class, sessionFactory);
	}
}
