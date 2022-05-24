package info.unterrainer.server.quarkus.dtos;

import io.quarkus.security.identity.SecurityIdentity;

import lombok.Data;

@Data
public class User {

    private String userName;

    public User(SecurityIdentity securityContext) {
        this.userName = securityContext.getPrincipal().getName();
    }
}