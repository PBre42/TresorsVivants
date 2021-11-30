package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.PersonneRepository;

@RestController
@RequestMapping("/personne")
public class PersonneController {

	@Autowired
	PersonneRepository personneRepository;
	
	
}
