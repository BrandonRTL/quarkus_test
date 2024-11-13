package edu.quarkus.resource;

import edu.quarkus.service.GreetService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    private GreetService greetService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetService.sayHello("World");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String hello(@PathParam("name") String name) {
        return greetService.sayHello(name);
    }

}
