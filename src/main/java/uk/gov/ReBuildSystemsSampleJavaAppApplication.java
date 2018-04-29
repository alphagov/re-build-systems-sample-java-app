package uk.gov;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import uk.gov.resources.HelloWorldResource;

public class ReBuildSystemsSampleJavaAppApplication extends Application<ReBuildSystemsSampleJavaAppConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ReBuildSystemsSampleJavaAppApplication().run(args);
    }

    @Override
    public String getName() {
        return "ReBuildSystemsSampleJavaApp";
    }

    @Override
    public void initialize(final Bootstrap<ReBuildSystemsSampleJavaAppConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ReBuildSystemsSampleJavaAppConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);
    }

}
