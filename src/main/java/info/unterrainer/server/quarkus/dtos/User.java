package info.unterrainer.server.quarkus.dtos;

import io.quarkus.security.identity.SecurityIdentity;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class User {

    private String userName;

    public User(SecurityIdentity securityContext) {
        this.userName = securityContext.getPrincipal().getName();
    }
}