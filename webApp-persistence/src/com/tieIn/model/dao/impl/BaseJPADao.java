package com.tieIn.model.dao.impl;

import javax.persistence.EntityManager;

public class BaseJPADao {

	public BaseJPADao() {
		// TODO Auto-generated constructor stub
	}
	/** 
	 * Returns JPA EntityManager reference. 
	 * @return 
	 */ 
	public EntityManager getEntityManager() { 
	  return JPADaoFactory.createEntityManager(); 
	}
}
