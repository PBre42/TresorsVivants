package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.PersonneRepository;
import model.Personne;

@RestController
@RequestMapping("/api/v1/")
public class PersonneController {

	@Autowired
	PersonneRepository personneRepository;
	
	// toutes les personnes
    public List<Personne> getAllEmployees(){
        return personneRepository.findAll();
    }
}
