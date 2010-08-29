package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ArtifactDefinition;
import spemarti.custom.dao.ArtifactDefinitionDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ArtifactDefinitionDaoImpl extends TOBaseHibernateDao<ArtifactDefinition, String> implements ArtifactDefinitionDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7734633507411279544L;

	private ArtifactDefinitionDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(ArtifactDefinition.class, sessionFactory);
	}
	
	public ArtifactDefinitionDaoImpl(SessionFactory sessionFactory) {
		super(ArtifactDefinition.class, sessionFactory);
	}

}
