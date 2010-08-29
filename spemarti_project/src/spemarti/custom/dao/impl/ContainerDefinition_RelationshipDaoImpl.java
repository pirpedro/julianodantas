package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ContainerDefinition_Relationship;
import spemarti.custom.dao.ContainerDefinition_RelationshipDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class ContainerDefinition_RelationshipDaoImpl extends TOBaseHibernateDao<ContainerDefinition_Relationship, String> implements ContainerDefinition_RelationshipDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3550680586845589941L;

	@SuppressWarnings("rawtypes")
	private ContainerDefinition_RelationshipDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(ContainerDefinition_Relationship.class, sessionFactory);
	}
	
	public ContainerDefinition_RelationshipDaoImpl(SessionFactory sessionFactory) {
		super(ContainerDefinition_Relationship.class, sessionFactory);
	}
}
