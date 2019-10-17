package com.gr43.backend.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public abstract class GenericDaoImpl<T extends Serializable> implements IGenericDao<T> {

    private Class< T> clazz;

    @PersistenceContext(unitName = "mysql_persistent", type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

    public GenericDaoImpl() {
    }

    @Override
    @Transactional
    public T findOne(Long id) {
        return this.entityManager.find(clazz, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List< T> findAll() {
        return (List<T>) this.entityManager.createQuery("select u from " + clazz.getName()+ " as u").getResultList();
    }

    @Override
    @Transactional
    public void save(T entity) {
        this.entityManager.persist(entity);
    }

    @Override
    public void update(T entity) {
        this.entityManager.merge(entity);
    }

    @Override
    public void delete(T entity) {
        this.entityManager.remove(entity);
    }

    @Override
    public void deleteById(Long entityId) {
        T entity = this.findOne(entityId);
        delete(entity);
    }

}
