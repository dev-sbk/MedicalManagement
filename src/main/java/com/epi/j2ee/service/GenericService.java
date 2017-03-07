
package com.epi.j2ee.service;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epi.j2ee.repository.IGenericRepository;

@Service
@Transactional
public class GenericService<T> implements IGenericService<T>, Serializable {
	private static final long serialVersionUID = 1L;
	private IGenericRepository<T> repository;

	@Override
	public void insert(T temp) {
		// TODO Auto-generated method stub
		repository.insert(temp);
	}

	@Override
	public T update(T temp) {
		// TODO Auto-generated method stub
		return repository.update(temp);
	}

	@Override
	public void delete(T temp) {
		// TODO Auto-generated method stub
		repository.delete(temp);
	}

	@Override
	public T find(Class<T> temp, Integer id) {
		// TODO Auto-generated method stub
		return repository.find(temp, id);
	}

	@Override
	public List<T> findAll(Class<T> temp) {
		// TODO Auto-generated method stub
		return repository.findAll(temp);
	}

	public IGenericRepository<T> getRepository() {
		return repository;
	}

	public void setRepository(IGenericRepository<T> repository) {
		this.repository = repository;
	}

}
