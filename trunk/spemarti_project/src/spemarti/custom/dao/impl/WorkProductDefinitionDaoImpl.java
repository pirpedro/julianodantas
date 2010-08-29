package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.WorkProductDefinition;
import spemarti.custom.dao.TOBaseHibernateDao;
import spemarti.custom.dao.WorkProductDefinitionDao;

@SuppressWarnings("unchecked")
public class WorkProductDefinitionDaoImpl extends TOBaseHibernateDao<WorkProductDefinition, String> implements WorkProductDefinitionDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2512545725595017587L;

	private WorkProductDefinitionDaoImpl(Class<?> objectClass, SessionFactory sessionFactory) {
		super(WorkProductDefinition.class, sessionFactory);
	}
	
	public WorkProductDefinitionDaoImpl(SessionFactory sessionFactory) {
		super(WorkProductDefinition.class, sessionFactory);
	}
}
