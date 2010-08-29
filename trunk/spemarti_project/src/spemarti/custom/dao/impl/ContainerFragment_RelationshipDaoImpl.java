package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ContainerFragment_Relationship;
import spemarti.custom.dao.ContainerFragment_RelationshipDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class ContainerFragment_RelationshipDaoImpl extends
		TOBaseHibernateDao<ContainerFragment_Relationship, String> implements
		ContainerFragment_RelationshipDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7337427754629069096L;

	@SuppressWarnings("rawtypes")
	private ContainerFragment_RelationshipDaoImpl(Class objectClass,
			SessionFactory sessionFactory) {
		super(ContainerFragment_Relationship.class, sessionFactory);
	}

	public ContainerFragment_RelationshipDaoImpl(SessionFactory sessionFactory) {
		super(ContainerFragment_Relationship.class, sessionFactory);
	}
}
