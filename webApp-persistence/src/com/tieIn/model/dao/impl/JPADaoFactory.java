package com.tieIn.model.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceUnitTransactionType;

import org.eclipse.persistence.config.TargetServer;

/**
 * A JPA DAO factory for providing reference to EntityManager.
 * 
 */
public class JPADaoFactory {

	private static final String PERSISTENCE_UNIT_NAME = "webApp-persistence";

	private static final String TRANSACTION_TYPE = "RESOURCE_LOCAL";

	private static final Object JDBC_DRIVER = "javax.persistence.jdbc.driver";

	private static final Object JDBC_URL = "javax.persistence.jdbc.url";

	private static final Object JDBC_USER = "javax.persistence.jdbc.user";

	private static final Object JDBC_PASSWORD = "javax.persistence.jdbc.password";

	private static final Object TARGET_SERVER = "eclipselink.target-server";

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	

	/**
	 * Returns reference to EntityManager instance. If null then create it using
	 * the persistence unit name as defined in the persistence.xml
	 * 
	 * @return EntityManager
	 */
	public static EntityManager createEntityManager() {
	
		Map properties = new HashMap();

		// Ensure RESOURCE_LOCAL transactions is used.
		properties.put(TRANSACTION_TYPE,
				PersistenceUnitTransactionType.RESOURCE_LOCAL.name());

		// Configure the internal EclipseLink connection pool
		properties.put(JDBC_DRIVER, "org.postgresql.Driver");
		properties
				.put(JDBC_URL, "jdbc:postgresql://54.213.19.6:5432/Sports_db");
		properties.put(JDBC_USER, "thetiein");
		properties.put(JDBC_PASSWORD, "thetieinapp");

		// Ensure that no server-platform is configured
		properties.put(TARGET_SERVER, TargetServer.None);

		if (entityManager == null) {
			entityManagerFactory = 
					//new PersistenceProvider().createEntityManagerFactory(
				//	PERSISTENCE_UNIT_NAME, properties);
			 Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			System.out.println(entityManagerFactory);
			entityManager = entityManagerFactory.createEntityManager();
		}
		return entityManager;
	}

	public static void close() {
		entityManager.close();
		entityManagerFactory.close();
	}

}