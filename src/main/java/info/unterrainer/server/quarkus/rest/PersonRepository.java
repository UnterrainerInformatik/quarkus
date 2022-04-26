package info.unterrainer.server.quarkus.rest;

import info.unterrainer.server.quarkus.dtos.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {

    // put your custom logic here as instance methods

    public Person findByName(String name){
        return find("name", name).firstResult();
    }

    public void deleteStefs(){
        delete("name", "Stef");
    }
}
