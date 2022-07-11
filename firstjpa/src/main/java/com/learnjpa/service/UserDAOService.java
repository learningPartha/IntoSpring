package com.learnjpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.learnjpa.entities.User;

@Repository
@Transactional
public class UserDAOService {
	
	//create entity manager to  save entity class to database
	//ensure entity manager kept in persistence context to reuse while saving
	@PersistenceContext
    private EntityManager entityManager ;
    
    //insert user record
    public long insertUserRecord(User user) {
    	entityManager.persist(user);
    	return user.getId();
    }
	
}
