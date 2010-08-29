<<<<<<< .mine
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Diagram;
import spemarti.custom.dao.DiagramDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class DiagramDaoImpl extends TOBaseHibernateDao<Diagram, String> implements DiagramDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 172798729056586166L;

	private DiagramDaoImpl(Class<?> objectClass, SessionFactory sessionFactory) {
		super(Diagram.class, sessionFactory);
	}
	
	public DiagramDaoImpl(SessionFactory sessionFactory) {
		super(Diagram.class, sessionFactory);
	}
	


}
=======
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Diagram;
import spemarti.custom.dao.DiagramDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class DiagramDaoImpl extends TOBaseHibernateDao<Diagram, String> implements DiagramDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 172798729056586166L;

	private DiagramDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Diagram.class, sessionFactory);
	}
	
	public DiagramDaoImpl(SessionFactory sessionFactory) {
		super(Diagram.class, sessionFactory);
	}
	


}
>>>>>>> .r19
