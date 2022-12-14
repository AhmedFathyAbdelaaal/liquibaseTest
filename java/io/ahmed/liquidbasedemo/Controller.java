package io.ahmed.liquidbasedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Our controller class, we first give it  @RestController
@RestController
// We then specify the mapping for the url.
@RequestMapping("/person")
public class Controller {

    //Auto wire our repository
    @Autowired
    private PersonRepository personRepository;

    // We specify the post mapping's url end 'and then create the function for it
    @PostMapping("/person")
    public String createPerson(@RequestParam String name){
        // This functions takes in the parameter name and then it saves it to our repository with the height as 6.7
        personRepository.save(new Person(name,"6.7"));
        // then it sends a message that the name was saved successfully by looking through the reposiotry
        return personRepository.findByName(name) + "Saved Successfully";
    }

    // Here we specify the Get mapping url end and create a simple function that displays all the repository content for us
    @GetMapping("/person")
    public List<Person> getAllThePeople(){
        return (List<Person>) personRepository.findAll();
    }

}
