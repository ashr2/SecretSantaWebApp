package com.ashwathrajesh.SecretSantaWebApp;
import java.util.ArrayList;

public class Person {
	private String name;
	private Person personAssigned;
	
	//Constructor
	public Person(String name){
		this.name = name;
		this.personAssigned = null;
	}
	
	//Assign this person a person to give gift to 
	public void setPersonAssigned(Person personAssigned) {
		this.personAssigned = personAssigned;
	}
	
	//Getter methods
	public String getName() {
		return(new String(name));
	}
	
	public Person getPersonAssigned() {
		return(personAssigned);
	}
}