package com.mateusb23.dao;

import javax.persistence.EntityManager;

import com.mateusb23.connection.ConnectionFactory;
import com.mateusb23.modelo.Local;

public class LocalDAO {

	public Local findById(Long id) {

		EntityManager em = new ConnectionFactory().getEntityManager();

		Local local = null;

		try {
			local = em.find(Local.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		return local;
	}

	public void update(Long id, Local local) {

		EntityManager em = new ConnectionFactory().getEntityManager();

		try {
			if (findById(id) != null) {
				em.getTransaction().begin();
				em.merge(local);
				em.getTransaction().commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

	}

	public void save(Long id, Local local) {

		EntityManager em = new ConnectionFactory().getEntityManager();

		try {
			if (findById(id) == null) {
				em.getTransaction().begin();
				em.persist(local);
				em.getTransaction().commit();
			} else {
				em.getTransaction().rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	public void removeById(Long id) {

		EntityManager em = new ConnectionFactory().getEntityManager();

		try {
			em.getTransaction().begin();
			Local local = findById(id);
			if (local != null) {
				em.remove(local);
				em.getTransaction().commit();
			} 
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

	}



}
