package sg.govtech.molb.springtut.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAll() {
        List<Person> persons = new ArrayList<Person>();

        personRepository.findAll().forEach(persons::add);
        return persons;
    }

    public Person getPerson(String entityId){
        return personRepository.findById(entityId).get();
    }

    public void addPerson(Person person){
        personRepository.save(person);
    }

    public void updatePerson(Person person){
        personRepository.save(person);
    }

    public void deletePerson(String entityId){
        personRepository.deleteById(entityId);
    }

}
