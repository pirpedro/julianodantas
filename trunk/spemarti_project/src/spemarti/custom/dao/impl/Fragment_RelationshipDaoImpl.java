package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Fragment_Relationship;
import spemarti.custom.dao.Fragment_RelationshipDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class Fragment_RelationshipDaoImpl extends
		TOBaseHibernateDao<Fragment_Relationship, String> implements
		Fragment_RelationshipDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -787565604546662925L;

	@SuppressWarnings("rawtypes")
	private Fragment_RelationshipDaoImpl(Class objectClass,
			SessionFactory sessionFactory) {
		super(Fragment_Relationship.class, sessionFactory);
	}

	public Fragment_RelationshipDaoImpl(SessionFactory sessionFactory) {
		super(Fragment_Relationship.class, sessionFactory);
	}
}
