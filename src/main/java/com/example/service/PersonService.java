package com.example.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	Hashtable<String, Person> persons = new Hashtable<String, Person>();

	public PersonService() {
		Person person = new Person();
		person.setId("1");
		person.setFirstName("Saravana Prabu");
		person.setLastName("S");
		person.setAge(32);
		persons.put("1", person);

		person = new Person();
		person.setId("2");
		person.setFirstName("Kalyani");
		person.setLastName("S");
		person.setAge(35);
		persons.put("2", person);
	}

	public Person getPerson(String id) {
		if (persons.containsKey(id)) {
			return persons.get(id);
		} else {
			return null;
		}
	}

	public Hashtable<String, Person> getAll() {
		return persons;
	}

}
