package com.gr43.backend.service;


import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericDaoImpl< T extends Serializable >  {
	
	private Class< T > clazz;
	 
	   @PersistenceContext
	   EntityManager entityManager;
	 
	   public void setClazz( Class< T > clazzToSet ) {
	      this.clazz = clazzToSet;
	   }
	 
	   public T findOne( Long id ){
	      return entityManager.find( clazz, id );
	   }

	   @SuppressWarnings("unchecked")
	   public List< T > findAll(){
		   return (List<T>) entityManager.createQuery("from " + clazz.getName()).getResultList();
	   }
	 
	   public void save( T entity ){
	      entityManager.persist( entity );
	   }
	 
	   public void update( T entity ){
	      entityManager.merge( entity );
	   }
	 
	   public void delete( T entity ){
	      entityManager.remove( entity );
	   }
	   public void deleteById( Long entityId ){
	      T entity = this.findOne(entityId);
	      delete( entity );
	   }

}
