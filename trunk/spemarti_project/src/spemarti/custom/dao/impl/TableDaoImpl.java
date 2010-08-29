package spemarti.custom.dao.impl;

import org.hibernate.SessionFactory;

import spemarti.Table;
import spemarti.custom.dao.TOBaseHibernateDao;
import spemarti.custom.dao.TableDao;

@SuppressWarnings("unchecked")
public class TableDaoImpl extends TOBaseHibernateDao<Table, String> implements TableDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6469104554568450562L;

	@SuppressWarnings("rawtypes")
	private TableDaoImpl(Class objectClass, SessionFactory sessionFactory) {
		super(Table.class, sessionFactory);
	}
	
	public TableDaoImpl(SessionFactory sessionFactory) {
		super(Table.class, sessionFactory);
	}

}

