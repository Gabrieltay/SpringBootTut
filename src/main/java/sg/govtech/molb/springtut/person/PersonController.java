package sg.govtech.molb.springtut.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/")
    public String getRoot(){
        return "Welcome to Spring Root Demo";
    }

    @RequestMapping("/persons")
    public List<Person> getAll(){
        return personService.getAll();
    }

    @RequestMapping("/persons/{entityId}")
    public Person getPerson(@PathVariable String entityId){
        return personService.getPerson(entityId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/persons")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/persons/{entityId}")
    public void updatePerson(@PathVariable String entityId, @RequestBody Person person){
        Person oldPerson = personService.getPerson(entityId);
        person.getAddress().setId(oldPerson.getAddress().getId());
        personService.updatePerson(person);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/persons/{entityId}")
    public void deletePerson(@PathVariable String entityId){
        personService.deletePerson(entityId);
    }
}
