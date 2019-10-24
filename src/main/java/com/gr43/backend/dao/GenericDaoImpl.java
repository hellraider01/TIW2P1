package com.gr43.backend.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public abstract class GenericDaoImpl<T extends Serializable> implements IGenericDao<T> {

  
    @PersistenceContext(unitName = "mysql_persistent")
    private EntityManager entityManager;

    public GenericDaoImpl() {
    }

    @Override
    @Transactional
    public T findOne(int id, Class< T> clazz) {
        return this.entityManager.find(clazz, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List< T> findAll(Class< T> clazz) {
        Query query = this.entityManager.createQuery("SELECT c FROM "  + clazz.getName() + " c");
        return (List<T>) query.getResultList();
        //return (List<T>) this.entityManager.createQuery("select u from " + clazz.getName()+ " as u").getResultList();
    }

    @Override
    @Transactional
    public void save(T entity) {
        this.entityManager.persist(entity);
    }

    @Override
    @Transactional
    public void update(T entity) {
        this.entityManager.merge(entity);
    }

    @Override
    @Transactional
    public void delete(T entity) {
        this.entityManager.remove(entity);
    }

    @Override
    @Transactional
    public void deleteById(int entityId, Class< T> clazz) {
        T entity = this.findOne(entityId, clazz);
        delete(entity);
    }

}
