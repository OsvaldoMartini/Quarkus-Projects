package com.shifthunter.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import io.smallrye.mutiny.*;

@Path("/lottoreactive")
public class ReactiveController {

    @Inject
    ReactiveService reactiveService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public Uni<String> hello(String name) {
        return reactiveService.hello(name);
    }
}
