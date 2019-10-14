package com.gr43.backend.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericDaoImpl<T> implements IGenericDao<T>  {
	
	   private Class< T > clazz;
	 
	   @PersistenceContext
	   EntityManager entityManager;
	 
	   public void setClazz( Class< T > clazzToSet ) {
	      this.clazz = clazzToSet;
	   }
	   
	   @Override
           @Transactional
	   public T findOne( Long id ){
	      return entityManager.find( clazz, id );
	   }

	   @SuppressWarnings("unchecked")
           @Transactional
	   public List< T > findAll(){
		   return (List<T>) entityManager.createQuery("from " + clazz.getName()).getResultList();
	   }
	 
	   @Override
           @Transactional
	   public void save( T entity ){
	      entityManager.persist( entity );
	   }
	 
	   @Override
           @Transactional
	   public void update( T entity ){
	      entityManager.merge( entity );
	   }
	 
	   @Override
           @Transactional
	   public void delete( T entity ){
	      entityManager.remove( entity );
	   }
	   
	   @Override
           @Transactional
	   public void deleteById( Long entityId ){
	      T entity = this.findOne(entityId);
	      delete( entity );
	   }

}
