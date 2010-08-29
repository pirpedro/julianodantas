<<<<<<< .mine
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ComplexInformationElement;
import spemarti.custom.dao.ComplexInformationElementDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ComplexInformationElementDaoImpl extends TOBaseHibernateDao<ComplexInformationElement, String> implements ComplexInformationElementDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5721010774277397659L;

	private ComplexInformationElementDaoImpl(Class<?> objectClass, SessionFactory sessionFactory) {
		super(ComplexInformationElement.class, sessionFactory);
	}
	
	public ComplexInformationElementDaoImpl(SessionFactory sessionFactory) {
		super(ComplexInformationElement.class, sessionFactory);
	}
}
=======
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ComplexInformationElement;
import spemarti.custom.dao.ComplexInformationElementDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ComplexInformationElementDaoImpl extends TOBaseHibernateDao<ComplexInformationElement, String> implements ComplexInformationElementDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5721010774277397659L;

	private ComplexInformationElementDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(ComplexInformationElement.class, sessionFactory);
	}
	
	public ComplexInformationElementDaoImpl(SessionFactory sessionFactory) {
		super(ComplexInformationElement.class, sessionFactory);
	}
}
>>>>>>> .r19
