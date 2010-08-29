<<<<<<< .mine
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Image;
import spemarti.custom.dao.ImageDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class ImageDaoImpl extends TOBaseHibernateDao<Image, String> implements ImageDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4685123011891351189L;

	private ImageDaoImpl(Class<?> objectClass, SessionFactory sessionFactory) {
		super(Image.class, sessionFactory);
	}
	
	public ImageDaoImpl(SessionFactory sessionFactory) {
		super(Image.class, sessionFactory);
	}
}
=======
package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Image;
import spemarti.custom.dao.ImageDao;
import spemarti.custom.dao.TOBaseHibernateDao;

public class ImageDaoImpl extends TOBaseHibernateDao<Image, String> implements ImageDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4685123011891351189L;

	private ImageDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Image.class, sessionFactory);
	}
	
	public ImageDaoImpl(SessionFactory sessionFactory) {
		super(Image.class, sessionFactory);
	}
}
>>>>>>> .r19
