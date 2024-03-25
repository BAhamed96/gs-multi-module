package com.example.common.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.example.common.domain.BaseDomain;
import com.example.common.dto.HeaderDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class AbstractDAO<T extends BaseDomain>{
	protected static final Logger logger = LogManager.getLogger(AbstractDAO.class);
	
	private Class<T> clazz;
	
	  @PersistenceContext
	  protected EntityManager entityManager;
	  
	  public void setClazz(final Class<T> clazzToSet) {
		  clazz = clazzToSet;
	  }


	    @Transactional(readOnly = true)
	    public T findById(final HeaderDto headerDto, final Long id){
	        T found = (T) entityManager.find(clazz, id);
	        return found;
	    }
	
}
