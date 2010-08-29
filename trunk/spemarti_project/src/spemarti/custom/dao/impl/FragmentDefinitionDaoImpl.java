package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.FragmentDefinition;
import spemarti.custom.dao.FragmentDefinitionDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class FragmentDefinitionDaoImpl extends TOBaseHibernateDao<FragmentDefinition, String> implements FragmentDefinitionDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8932079778175869379L;

	@SuppressWarnings("rawtypes")
	private FragmentDefinitionDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(FragmentDefinition.class, sessionFactory);
	}
	
	public FragmentDefinitionDaoImpl(SessionFactory sessionFactory) {
		super(FragmentDefinition.class, sessionFactory);
	}
}
