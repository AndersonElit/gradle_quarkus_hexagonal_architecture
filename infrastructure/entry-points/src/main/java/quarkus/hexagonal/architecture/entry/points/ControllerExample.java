package quarkus.hexagonal.architecture.entry.points;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class ControllerExample {

    @GET
    public String hello() {
        return "Hello from the controller module!";
    }
}
