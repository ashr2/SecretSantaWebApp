package com.ashwathrajesh.SecretSantaWebApp;
import java.util.ArrayList;
import java.lang.Math;

public class Group {
	
	private String name;
	private ArrayList<Person> persons;
	public final static int PRICE_LIMIT = 15;

	public Group() {
		persons = new ArrayList<Person>();
	}

	public void addPerson(Person person) {
		persons.add(person);
	}

	public void assignPersons() {
		ArrayList<Person> personsWithoutGift = new ArrayList<Person>();
		for(Person person: this.persons) {
			personsWithoutGift.add(person);
		}
		for(Person person: this.persons) {
			boolean done = false;
			while(!done) {
				int randInt = (int)(Math.random() * personsWithoutGift.size());
				if(personsWithoutGift.get(randInt) != person) {
					person.setPersonAssigned(personsWithoutGift.get(randInt));
					personsWithoutGift.remove(randInt);
					done = true;
				}
			}
		}
	}

	public ArrayList<Person> getPersons() {
		return(new ArrayList<Person>(persons));
	}
}