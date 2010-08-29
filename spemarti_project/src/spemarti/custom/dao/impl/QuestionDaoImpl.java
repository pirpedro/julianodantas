package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Question;
import spemarti.custom.dao.QuestionDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class QuestionDaoImpl extends TOBaseHibernateDao<Question, String> implements QuestionDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7790392307072544986L;

	@SuppressWarnings("rawtypes")
	private QuestionDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Question.class, sessionFactory);
	}
	
	public QuestionDaoImpl(SessionFactory sessionFactory) {
		super(Question.class, sessionFactory);
	}
}
