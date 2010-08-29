package spemarti.custom.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Example.PropertySelector;
import org.hibernate.criterion.MatchMode;
import org.hibernate.type.Type;

public abstract class TOBaseHibernateDao<T, PK extends Serializable> implements
		TOBaseDao<T, PK>, PropertySelector {
	private static final Log logger = LogFactory
			.getLog(TOBaseHibernateDao.class);
	@SuppressWarnings("rawtypes")
	private final Class objectClass;

	private final SessionFactory sessionFactory;

	protected TOBaseHibernateDao(final Class objectClass,
			final SessionFactory sessionFactory) {
		this.objectClass = objectClass;
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getObjectClass() {
		return objectClass;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public int findByExamplePageCount(final T example) {
		@SuppressWarnings("rawtypes")
		final List l = findByExample(example);
		final Integer i = new Integer(l.size());
		return i.intValue();
	}

	public int listAllPageCount() {
		@SuppressWarnings("rawtypes")
		final List l = listAll();
		final Integer i = new Integer(l.size());
		return i.intValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.ufrgs.hcpa.template.dao.GetNetBaseDao#findOneByExample(T)
	 */
	public T findOneByExample(final T example) {
		@SuppressWarnings("unchecked")
		final List<T> res = findByExample(example, 0, 1);
		if ((res != null) && (res.size() == 1)) {
			return res.get(0);
		} else {
			return null;
		}
	}

	public T save(final T object) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.getTransaction();
			tx.begin();
			session.save(object);
			session.flush();
			return object;
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	public void update(final T object) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.getTransaction();
			session.update(object);
			session.flush();
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	public void rebind(final T object) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			session.refresh(object);
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	public void delete(final T object) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			session.delete(object);
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public T load(final PK primaryKey) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			final Object o = session.load(objectClass, primaryKey);
			return (T) o;
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public T get(final PK primaryKey) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			final Object o = session.load(objectClass, primaryKey);
			return (T) o;
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List listAll() {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			final Criteria c = session.createCriteria(objectClass);
			addOrderToCriteria(c);
			return c.list();
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List findByExample(final T example) {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			final Criteria c = session.createCriteria(objectClass);
			c.add(Example.create(example).enableLike(MatchMode.ANYWHERE)
					.ignoreCase().setPropertySelector(this));
			addOrderToCriteria(c);
			addPropertiedToCriteria(c, example);
			return c.list();
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	protected void addPropertiedToCriteria(final Criteria c, final T example) {
	}

	@SuppressWarnings("unchecked")
	public List findByExample(final T example, final int first, final int max) {
		Session session = null;
    	Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			final Criteria c = session.createCriteria(objectClass);
			c.add(Example.create(example).enableLike(MatchMode.ANYWHERE)
					.ignoreCase().setPropertySelector(this));
			addPropertiedToCriteria(c, example);
			addOrderToCriteria(c);
			if (first != 0) {
				c.setFirstResult(first);
			}
			if (max != 0) {
				c.setMaxResults(max);
			}
			return c.list();
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List listAll(final int first, final int max) {
		Session session = null;
    	Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			final Criteria c = session.createCriteria(objectClass);
			addOrderToCriteria(c);
			if (first != 0) {
				c.setFirstResult(first);
			}
			if (max != 0) {
				c.setMaxResults(max);
			}
			return c.list();
		} catch (final HibernateException ex) {
			TOBaseHibernateDao.logger.error(ex);
			throw ex;
		} finally {
			if (tx != null) {
				tx.commit();
			}
			session.close();
		}
	}

	protected void addOrderToCriteria(Criteria c) {
	}

	public boolean include(Object propertyValue, String propertyName, Type type) {
		if ((propertyValue != null) && (propertyValue instanceof String)) {
			return !"".equals(((String) propertyValue).trim());
		}
		return propertyValue != null;
	}
}
