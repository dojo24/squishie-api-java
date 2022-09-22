package com.codingdojo.com.javaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.javaapi.model.Squish;
import com.codingdojo.com.javaapi.repository.SquishRepo;

@Service
public class SquishServ {

	@Autowired
	private SquishRepo squishRepo;
	
	public List<Squish> getAll() {
		return squishRepo.findAll();
	}
	
	public Squish create(Squish newSquish) {
		return squishRepo.save(newSquish);
	}
}
