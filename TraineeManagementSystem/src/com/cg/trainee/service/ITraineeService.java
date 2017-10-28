package com.cg.trainee.service;

import java.util.List;

import com.cg.trainee.model.Login;
import com.cg.trainee.model.Trainee;

public interface ITraineeService {

	List<Login> getLoginDetails();

	void addDetails(Trainee trainee);

	List<Integer> retrieveIds();

	void deleteTrainee(int traineeId);

	List<Trainee> retrieveDetails();

}
