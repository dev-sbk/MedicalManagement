/**
 * 
 */
package com.epi.j2ee.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class GenericRepository<T> implements IGenericRepository<T>,Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager em;

	@Override
	public void insert(T temp) {
		em.persist(temp);
	}

	@Override
	public T update(T temp) {
		em.merge(temp);
		return temp;
	}

	@Override
	public void delete(T temp) {
		em.remove(em.merge(temp));
	}
	@Override
	public T find(Class<T> temp, Integer id) {
		return  em.find(temp, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(Class<T> temp) {
		// TODO Auto-generated method stub
		Query req=em.createQuery("SELECT t FROM "+temp.getName()+" t");
		return req.getResultList();
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}