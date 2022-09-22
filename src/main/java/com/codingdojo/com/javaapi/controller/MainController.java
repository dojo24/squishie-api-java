package com.codingdojo.com.javaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.com.javaapi.model.Squish;
import com.codingdojo.com.javaapi.service.SquishServ;

@CrossOrigin(origins = "http://localhost:8080/api/", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	private SquishServ squishServ;
	
	@GetMapping(path="/", produces="application/json")
	public List<Squish> showSquish() {
		return squishServ.getAll();
	}
	@GetMapping(path="/squishies")
	public List<Squish> showAll() {
		return squishServ.getAll();
	}
	
	@RequestMapping(path="/", produces="application/json", method=RequestMethod.POST)
	public Squish addSquish(@RequestBody Squish squish) {
		return squishServ.create(squish);
	}
	
	

}
