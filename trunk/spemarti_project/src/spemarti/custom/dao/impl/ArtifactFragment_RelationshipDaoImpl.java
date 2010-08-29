package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ArtifactFragment_Relationship;
import spemarti.custom.dao.ArtifactFragment_RelationshipDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ArtifactFragment_RelationshipDaoImpl extends TOBaseHibernateDao<ArtifactFragment_Relationship, String> implements ArtifactFragment_RelationshipDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8834258233560477874L;

	private ArtifactFragment_RelationshipDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(ArtifactFragment_Relationship.class, sessionFactory);
	}
	
	public ArtifactFragment_RelationshipDaoImpl(SessionFactory sessionFactory) {
		super(ArtifactFragment_Relationship.class, sessionFactory);
	}
}
