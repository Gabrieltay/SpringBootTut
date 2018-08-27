package sg.govtech.molb.springtut.person;

import sg.govtech.molb.springtut.Address.Address;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import static javax.persistence.CascadeType.*;

@Entity
public class Person {

    @Id
    private String entityId;
    private String name;
    private String email;

    @OneToOne(cascade={MERGE, PERSIST, REMOVE, REFRESH, DETACH})
    private Address address;

    public Person(){

    }

    public Person(String entityId, String name, String email, Address address) {
        this.entityId = entityId;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
