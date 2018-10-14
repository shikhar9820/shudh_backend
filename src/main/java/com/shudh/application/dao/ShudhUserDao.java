package com.shudh.application.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shudh.application.model.ShudhUser;

/**
* <h1>Shudh Applications Backend</h1><br>
* 
* <h1>Class Name:/h1> ShudhUserService <br>
* 
* <h2>This dao class consists all CRUD methods</h2>
* 
*
* @author  Utkarsh Gupta
* @version 1.0
* @since   14-10-2018
*/
@Component
public class ShudhUserDao implements Dao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	/**
	* <h1>Shudh Applications Backend</h1>
	* <h2>This method fetches an object of ShudhUser by providing id (primary key).</h2>
	* 
	* @see ShudhUser
	* @author  Utkarsh Gupta
	* @version 1.0
	* @since   14-10-2018
	*/
	@Override
	public Object getEntityById(Integer entityId) {

		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(ShudhUser.class);
		
		criteria.add(Restrictions.eq("id", entityId));
		
		Object shudhUser = criteria.uniqueResult();
		
		return shudhUser;
	}

	/**
	* <h1>Shudh Applications Backend</h1>
	* <h2>This method fetches a list of ShudhUser.</h2>
	* 
	* @see ShudhUser
	* @author  Utkarsh Gupta
	* @version 1.0
	* @since   14-10-2018
	*/
	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getAllEntities(Integer start, Integer count) {
		
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
				
		//Create a CriteriaBuilder instance by calling the Session.getCriteriaBuilder() method.
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		//Create a query object by creating an instance of the CriteriaQuery interface.
		CriteriaQuery<ShudhUser> query = builder.createQuery(ShudhUser.class);
		
		//Set the query Root by calling the from() method on the CriteriaQuery object
		//to define a range variable in FROM clause.
		Root<ShudhUser> root = query.from(ShudhUser.class);

		//Specify what the type of the query result will be by calling the select()
		//method of the CriteriaQuery object.
		query.select(root);
		
		// Prepare the query for execution by creating a org.hibernate.query.Query instance by 
		//calling the Session.createQuery() method, specifying the type of the query result.
		Query<ShudhUser> q = session.createQuery(query);
		
		//Execute the query by calling the getResultList() or getSingleResult() method on the 
		//org.hibernate.query.Query object.
		List<Object> list = (List<Object>) (List<?>) q.getResultList();
		
		return list;
	}

	/**
	* <h1>Shudh Applications Backend</h1>
	* <h2>This method updates an Object of ShudhUser.</h2>
	* 
	* @param ShudhUser
	* @see ShudhUser
	* @author  Utkarsh Gupta
	* @version 1.0
	* @since   14-10-2018
	*/
	@Override
	public Object updateEntity(Object entity) {

		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		
		session.update(entity);
		
		return null;
	}

	/**
	* <h1>Shudh Applications Backend</h1>
	* <h2>This method deletes an Object of ShudhUser.</h2>
	* 
	* @param ShudhUser
	* @see ShudhUser
	* @author  Utkarsh Gupta
	* @version 1.0
	* @since   14-10-2018
	*/
	@Override
	public void deleteEntity(Object entity) {
		
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		
		session.delete(entity);
	}

	/**
	* <h1>Shudh Applications Backend</h1>
	* <h2>This method creates an Object of ShudhUser. Please initialize the object.</h2>
	* 
	* @param ShudhUser
	* @see ShudhUser
	* @author  Utkarsh Gupta
	* @version 1.0
	* @since   14-10-2018
	*/
	@Override
	public Object createEntity(Object entity) {
		
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		
		session.save(entity);
		
		return entity;
	}

}
