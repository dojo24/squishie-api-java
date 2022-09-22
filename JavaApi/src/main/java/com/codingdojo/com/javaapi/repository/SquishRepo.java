package com.codingdojo.com.javaapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.com.javaapi.model.Squish;

@Repository
public interface SquishRepo extends CrudRepository<Squish, Long> {
	List<Squish> findAll();
}
