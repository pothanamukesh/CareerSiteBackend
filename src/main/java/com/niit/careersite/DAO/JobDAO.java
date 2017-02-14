package com.niit.careersite.DAO;

import java.util.List;

import com.niit.careersite.model.Job;

public interface JobDAO {
	public boolean saveOrUpdate(Job job);

	public boolean delete(Job job);

	public List<Job> list();
}
