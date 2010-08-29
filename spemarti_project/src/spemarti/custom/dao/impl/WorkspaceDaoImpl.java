package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Workspace;
import spemarti.custom.dao.TOBaseHibernateDao;
import spemarti.custom.dao.WorkspaceDao;

@SuppressWarnings("unchecked")
public class WorkspaceDaoImpl extends TOBaseHibernateDao<Workspace, String> implements WorkspaceDao {

	private WorkspaceDaoImpl(Class<?> objectClass, SessionFactory sessionFactory) {
		super(Workspace.class, sessionFactory);
	}
	
	public WorkspaceDaoImpl(SessionFactory sessionFactory) {
		super(Workspace.class, sessionFactory);
	}
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 4280652387552190495L;
}
