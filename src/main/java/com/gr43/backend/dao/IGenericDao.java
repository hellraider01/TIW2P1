package com.gr43.backend.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;


public interface IGenericDao<T> {

    public T findOne(Long id);

    public List<T> findAll();

    public void save(T entity);

    public void update(T entity);

    public void delete(T entity);

    public void deleteById(Long entityId);
}