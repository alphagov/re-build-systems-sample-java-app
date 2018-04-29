package uk.gov.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class HelloWorldResource {
    @GET
    public String sayHello() {
        return "Hello world!";
    }
}
