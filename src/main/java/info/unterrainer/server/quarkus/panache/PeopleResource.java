package info.unterrainer.server.quarkus.panache;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(hal = true, path = "people")
public interface PeopleResource extends PanacheRepositoryResource<PersonRepository, Person, Long> {
}
