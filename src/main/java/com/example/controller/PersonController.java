package com.example.controller;

import java.util.Hashtable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	static Logger LOGGER = LoggerFactory.getLogger("");
	@Autowired
	PersonService personSer;

	@RequestMapping("/all")
	public Hashtable<String, Person> getAll() {
		LOGGER.info("************Just an info**************");
		LOGGER.debug("************Just a debug**************");
		return personSer.getAll();
	}

	@RequestMapping("{id}")
	public Person getPerson(@PathVariable("id") String id) {
		return personSer.getPerson(id);
	}
}
