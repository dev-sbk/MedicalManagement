package com.epi.j2ee.service;
import java.util.List;
public interface IGenericService<T> {
	public void insert(T temp);
	public T update(T temp);
	public void delete(T temp);
	public T find(Class<T> temp,Integer id);
	public List<T> findAll(Class<T> temp);
}
