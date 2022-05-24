package info.unterrainer.server.quarkus.jpa;

import info.unterrainer.server.quarkus.dtos.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
}
