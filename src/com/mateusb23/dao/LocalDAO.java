package com.mateusb23.dao;

import javax.persistence.EntityManager;

import com.mateusb23.connection.ConnectionFactory;
import com.mateusb23.modelo.Local;

public class LocalDAO {
	
	public Local findById(Long id) {
		
		EntityManager em = new ConnectionFactory().getEntityManager();
		
		Local local = null;
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return local;
	}

	public Local save(Local local) {
		
		EntityManager em = new ConnectionFactory().getEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(local);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return local;
	}
	
	public Local update(Local local) {
		
		EntityManager em = new ConnectionFactory().getEntityManager();
		
		try {
			em.getTransaction().begin();
			em.merge(local);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return local;
	}
	
	
	
}
