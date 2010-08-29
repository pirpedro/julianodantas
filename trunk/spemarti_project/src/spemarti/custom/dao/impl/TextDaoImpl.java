package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Text;
import spemarti.custom.dao.TOBaseHibernateDao;
import spemarti.custom.dao.TextDao;

public class TextDaoImpl extends TOBaseHibernateDao<Text, String> implements TextDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6904835720803001202L;

	private TextDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Text.class, sessionFactory);
	}
	
	public TextDaoImpl(SessionFactory sessionFactory) {
		super(Text.class, sessionFactory);
	}
}
