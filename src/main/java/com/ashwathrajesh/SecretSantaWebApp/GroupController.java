package com.ashwathrajesh.SecretSantaWebApp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class GroupController {
	
	public ArrayList<Person> createGroup() {
		Group myGroup = new Group();
		myGroup.addPerson(new Person("Person A"));
		myGroup.addPerson(new Person("Person B"));
		myGroup.addPerson(new Person("Person C"));
		myGroup.addPerson(new Person("Person D"));
		myGroup.assignPersons();
		return(myGroup.getPersons());
	}
	
	@GetMapping("/group")
	public String group(Model model) {
		ArrayList<Person> persons = createGroup();
		model.addAttribute("persons", persons.get(0).toString());
		return "group";
	}
	
}
