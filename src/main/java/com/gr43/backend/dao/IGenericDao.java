package com.gr43.backend.dao;

import java.util.List;


public interface IGenericDao<T> {

    public T findOne(int id, Class< T> clazz);

    public List<T> findAll(Class< T> clazz);

    public void save(T entity);

    public void update(T entity);

    public void delete(T entity);

    public void deleteById(int entityId, Class< T> clazz);
}
