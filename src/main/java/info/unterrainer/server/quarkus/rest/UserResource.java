package info.unterrainer.server.quarkus.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import info.unterrainer.server.quarkus.dtos.User;
import io.quarkus.security.identity.SecurityIdentity;

@Path("/api/users")
public class UserResource {

    @Inject
    SecurityIdentity keycloakSecurityContext;

    @GET
    @Path("/me")
    @Produces(MediaType.APPLICATION_JSON)
    public User me() {
        return new User(keycloakSecurityContext);
    }
}
