package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Diagram;
import spemarti.custom.dao.DiagramDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class DiagramDaoImpl extends TOBaseHibernateDao<Diagram, String>
		implements DiagramDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 172798729056586166L;

	@SuppressWarnings("rawtypes")
	private DiagramDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Diagram.class, sessionFactory);
	}

	public DiagramDaoImpl(SessionFactory sessionFactory) {
		super(Diagram.class, sessionFactory);
	}
}
