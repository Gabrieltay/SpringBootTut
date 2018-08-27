package sg.govtech.molb.springtut.person;

import org.springframework.data.repository.CrudRepository;
import sg.govtech.molb.springtut.Address.Address;

public interface PersonRepository extends CrudRepository<Person, String> {
}
