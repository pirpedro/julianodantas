<<<<<<< .mine
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.VersionedExtent;
import spemarti.custom.dao.TOBaseHibernateDao;
import spemarti.custom.dao.VersionedExtentDao;

public class VersionedExtentDaoImpl extends TOBaseHibernateDao<VersionedExtent, String> implements VersionedExtentDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1376814905001211502L;

	private VersionedExtentDaoImpl(Class<?> objectClass, SessionFactory sessionFactory) {
		super(VersionedExtent.class, sessionFactory);
	}
	
	public VersionedExtentDaoImpl(SessionFactory sessionFactory) {
		super(VersionedExtent.class, sessionFactory);
	}
	
}
=======
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.VersionedExtent;
import spemarti.custom.dao.TOBaseHibernateDao;
import spemarti.custom.dao.VersionedExtentDao;

public class VersionedExtentDaoImpl extends TOBaseHibernateDao<VersionedExtent, String> implements VersionedExtentDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1376814905001211502L;

	private VersionedExtentDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(VersionedExtent.class, sessionFactory);
	}
	
	public VersionedExtentDaoImpl(SessionFactory sessionFactory) {
		super(VersionedExtent.class, sessionFactory);
	}
	
}
>>>>>>> .r19
