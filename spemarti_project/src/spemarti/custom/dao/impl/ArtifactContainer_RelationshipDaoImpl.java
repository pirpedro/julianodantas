package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ArtifactContainer_Relationship;
import spemarti.custom.dao.ArtifactContainer_RelationshipDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ArtifactContainer_RelationshipDaoImpl extends TOBaseHibernateDao<ArtifactContainer_Relationship, String> implements ArtifactContainer_RelationshipDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3979402827525336757L;

	@SuppressWarnings("rawtypes")
	private ArtifactContainer_RelationshipDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(ArtifactContainer_Relationship.class, sessionFactory);
	}
	
	public ArtifactContainer_RelationshipDaoImpl(SessionFactory sessionFactory) {
		super(ArtifactContainer_Relationship.class, sessionFactory);
	}
}
