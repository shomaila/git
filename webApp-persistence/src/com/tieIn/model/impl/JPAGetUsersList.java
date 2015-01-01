package com.tieIn.model.impl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tieIn.model.Tbl_User;

public class JPAGetUsersList {
	 private static final String PERSISTENCE_UNIT_NAME = "webApp";
	  private static EntityManagerFactory factory;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		    EntityManager em = factory.createEntityManager();
		try {
			EntityTransaction entr = em.getTransaction();
			entr.begin();
			Query query = em.createQuery("SELECT t FROM Tbl_User t ");
			List results = query.getResultList();
			if (results.size() != 0) {
				Iterator userIterator = results.iterator();
				while (userIterator.hasNext()) {
					Tbl_User user = (Tbl_User) userIterator.next();
					System.out.print("sname:" + user.getUser_name());
					System.out.println();
				}
			} else {
				System.out.println("Record not found.");
			}
			entr.commit();
		} finally {
			em.close();
		}

	}

}
