package com.cg.trainee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.trainee.model.Login;
import com.cg.trainee.model.Trainee;

@Repository
public class TraineeDaoImpl implements ITraineeDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Login> getLoginDetails() {
		// TODO Auto-generated method stub
		
		Query query = entityManager.createNamedQuery("getLogin", Login.class);
		@SuppressWarnings("unchecked")
		List<Login> list = query.getResultList();
	
		return list;
	}

	@Override
	public void addDetails(Trainee trainee) {
		// TODO Auto-generated method stub
		entityManager.persist(trainee);
		entityManager.flush();	
	}

	@Override
	public List<Integer> retrieveIds() {
		// TODO Auto-generated method stub
		TypedQuery<Integer> query = entityManager.createNamedQuery("getTraineeIds", Integer.class);
		List<Integer> idList = query.getResultList();
		return idList;
	}

	@Override
	public void deleteTrainee(int traineeId) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNamedQuery("deleteTraineeById");
		query.setParameter("tId", traineeId);
		query.executeUpdate();
	}

	@Override
	public List<Trainee> retrieveDetails() {
		// TODO Auto-generated method stub
		Query query = entityManager.createNamedQuery("getAllTrainees");
		@SuppressWarnings("unchecked")
		List<Trainee> traineeList = query.getResultList();
		
		return traineeList;
	}
	
}
