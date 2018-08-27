package sg.govtech.molb.springtut.person;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private String entityId;
    private String name;
    private String email;

    public Person(){

    }

    public Person(String entityId, String name, String email) {
        this.entityId = entityId;
        this.name = name;
        this.email = email;
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
}
