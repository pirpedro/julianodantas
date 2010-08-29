package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.LabeledText;
import spemarti.custom.dao.LabeledTextDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class LabeledTextDaoImpl extends TOBaseHibernateDao<LabeledText, String>
		implements LabeledTextDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1718100163000710168L;

	@SuppressWarnings("rawtypes")
	private LabeledTextDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(LabeledText.class, sessionFactory);
	}

	public LabeledTextDaoImpl(SessionFactory sessionFactory) {
		super(LabeledText.class, sessionFactory);
	}
}
