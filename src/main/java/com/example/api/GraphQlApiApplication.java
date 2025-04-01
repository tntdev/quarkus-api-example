/* Copyright: (C) Lala AG 2025, all rights reserved */
package com.example.api;

import static io.quarkus.runtime.Quarkus.run;

import jakarta.ws.rs.core.Application;

import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class GraphQlApiApplication extends Application {
    public static void main(String[] args) {
        run(args);
    }
}
