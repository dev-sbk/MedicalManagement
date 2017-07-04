package com.epi.j2ee.metier;

import java.util.List;

public interface IGenericService<T> {

    public void insert(T temp);

    public T update(T temp);

    public void delete(T temp);

    public T find(Class<T> temp, Integer id);

    public T find(Class<T> temp, String username);

    public List<T> findAll(Class<T> temp);

    public List<T> findAll(Class<T> temp, String key, Object mc);
}
