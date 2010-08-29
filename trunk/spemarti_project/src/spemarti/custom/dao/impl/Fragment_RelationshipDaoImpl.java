package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Fragment_Relationship;
import spemarti.custom.dao.TOBaseHibernateDao;
import spemarti.custom.dao.Fragment_RelationshipDao;

public class Fragment_RelationshipDaoImpl extends TOBaseHibernateDao<Fragment_Relationship, String> implements Fragment_RelationshipDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -787565604546662925L;

	private Fragment_RelationshipDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Fragment_Relationship.class, sessionFactory);
	}
	
	public Fragment_RelationshipDaoImpl(SessionFactory sessionFactory) {
		super(Fragment_Relationship.class, sessionFactory);
	}
}
