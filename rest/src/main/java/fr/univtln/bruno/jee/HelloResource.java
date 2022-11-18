package fr.univtln.bruno.jee;

import fr.univtln.bruno.jee.ejb.GoodbyeService;
import fr.univtln.bruno.jee.ejb.Language;
import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import static fr.univtln.bruno.jee.ejb.Language.Code.FR;

@Path("/hello")
public class HelloResource {

    @Inject
    private GreetingService greetingService;

    @EJB
    @Language(FR)
    private GoodbyeService goodbyeService;

    @GET
    public String sayHello() {
        return "Hello World";
    }

    @GET
    @Path("cdi/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String doGreeting(@PathParam("name") String someValue, @QueryParam("language") String language) {
        return String.format(greetingService.getGreetingTemplate(language), someValue);
    }

    @GET
    @Path("bye")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayGoodbye() {
        return goodbyeService.sayGoodbye();
    }

}


