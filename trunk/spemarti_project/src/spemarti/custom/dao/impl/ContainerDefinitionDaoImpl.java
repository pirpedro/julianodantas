package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ContainerDefinition;
import spemarti.custom.dao.ContainerDefinitionDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class ContainerDefinitionDaoImpl extends
		TOBaseHibernateDao<ContainerDefinition, String> implements
		ContainerDefinitionDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -904343266192687674L;

	@SuppressWarnings("rawtypes")
	private ContainerDefinitionDaoImpl(Class objectClass,
			SessionFactory sessionFactory) {
		super(ContainerDefinition.class, sessionFactory);
	}

	public ContainerDefinitionDaoImpl(SessionFactory sessionFactory) {
		super(ContainerDefinition.class, sessionFactory);
	}
}
