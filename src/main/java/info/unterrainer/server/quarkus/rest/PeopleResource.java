package info.unterrainer.server.quarkus.rest;

import info.unterrainer.server.quarkus.dtos.Person;
import info.unterrainer.server.quarkus.jpa.PersonRepository;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(hal = true, path = "people")
public interface PeopleResource extends PanacheRepositoryResource<PersonRepository, Person, Long> {
}
