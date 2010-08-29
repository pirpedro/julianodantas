<<<<<<< .mine
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ElementGroup;
import spemarti.custom.dao.ElementGroupDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ElementGroupDaoImpl extends TOBaseHibernateDao<ElementGroup, String> implements ElementGroupDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6758187412879777570L;

	private ElementGroupDaoImpl(Class<?> objectClass, SessionFactory sessionFactory) {
		super(ElementGroup.class, sessionFactory);
	}
	
	public ElementGroupDaoImpl(SessionFactory sessionFactory) {
		super(ElementGroup.class, sessionFactory);
	}
}
=======
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.ElementGroup;
import spemarti.custom.dao.ElementGroupDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ElementGroupDaoImpl extends TOBaseHibernateDao<ElementGroup, String> implements ElementGroupDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6758187412879777570L;

	private ElementGroupDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(ElementGroup.class, sessionFactory);
	}
	
	public ElementGroupDaoImpl(SessionFactory sessionFactory) {
		super(ElementGroup.class, sessionFactory);
	}
}
>>>>>>> .r19
