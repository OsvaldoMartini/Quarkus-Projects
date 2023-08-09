package com.shifthunter.quarkus;

import io.smallrye.mutiny.*;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReactiveService {

    public Uni<String> hello(String name) {
        return Uni.createFrom().item(name).onItem().transform(s -> "hello " + s);
    }
}
