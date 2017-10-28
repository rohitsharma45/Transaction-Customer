package com.cg.trainee.dao;

import java.util.List;

import com.cg.trainee.model.Login;
import com.cg.trainee.model.Trainee;

public interface ITraineeDao {

	List<Login> getLoginDetails();

	void addDetails(Trainee trainee);

	List<Integer> retrieveIds();

	void deleteTrainee(int traineeId);

	List<Trainee> retrieveDetails();

}
