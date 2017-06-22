package com.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MyDropwizardApplication extends Application<MyDropwizardApplicationConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MyDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "my-dropwizard-app";
    }

    @Override
    public void initialize(final Bootstrap<MyDropwizardApplicationConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MyDropwizardApplicationConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
