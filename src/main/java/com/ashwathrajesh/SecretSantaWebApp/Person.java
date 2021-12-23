package com.ashwathrajesh.SecretSantaWebApp;
import java.util.ArrayList;

public class Person {
	private String name;
	private Person personAssigned;
	private String message;

	//Constructor
	public Person(String name){
		this.name = name;
		this.personAssigned = null;
		this.message = null;
	}
	
	//Assign this person a person to give gift to 
	public void setPersonAssigned(Person personAssigned) {
		this.personAssigned = personAssigned;
		this.message = this.toString();
	}
	
	//Getter methods
	public String getName() {
		return(new String(name));
	}
	
	public Person getPersonAssigned() {
		return(personAssigned);
	}
	
	public String toString() {
		return(this.name + " is giving a gift to " + this.personAssigned.name);
	}
}