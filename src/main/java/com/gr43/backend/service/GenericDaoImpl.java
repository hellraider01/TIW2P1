package com.gr43.backend.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public abstract class GenericDaoImpl<T> implements IGenericDao<T>  {
	
	   private Class< T > clazz;
	 
	   @PersistenceContext
	   EntityManager entityManager;
	 
	   public void setClazz( Class< T > clazzToSet ) {
	      this.clazz = clazzToSet;
	   }
	   
	   @Override
	   public T findOne( Long id ){
	      return entityManager.find( clazz, id );
	   }

	   @SuppressWarnings("unchecked")
	   public List< T > findAll(){
		   return (List<T>) entityManager.createQuery("from " + clazz.getName()).getResultList();
	   }
	 
	   @Override
	   public void save( T entity ){
	      entityManager.persist( entity );
	   }
	 
	   @Override
	   public void update( T entity ){
	      entityManager.merge( entity );
	   }
	 
	   @Override
	   public void delete( T entity ){
	      entityManager.remove( entity );
	   }
	   
	   @Override
	   public void deleteById( Long entityId ){
	      T entity = this.findOne(entityId);
	      delete( entity );
	   }

}
