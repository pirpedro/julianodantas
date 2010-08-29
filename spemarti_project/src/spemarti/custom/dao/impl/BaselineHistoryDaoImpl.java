package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.BaselineHistory;
import spemarti.custom.dao.BaselineHistoryDao;
import spemarti.custom.dao.TOBaseHibernateDao;

@SuppressWarnings("unchecked")
public class BaselineHistoryDaoImpl extends
		TOBaseHibernateDao<BaselineHistory, String> implements
		BaselineHistoryDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2240578017087066360L;

	@SuppressWarnings("rawtypes")
	private BaselineHistoryDaoImpl(Class objectClass,
			SessionFactory sessionFactory) {
		super(BaselineHistory.class, sessionFactory);
	}

	public BaselineHistoryDaoImpl(SessionFactory sessionFactory) {
		super(BaselineHistory.class, sessionFactory);
	}
}
