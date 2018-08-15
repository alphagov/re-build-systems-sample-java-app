package uk.gov.apprule;

import io.dropwizard.testing.ConfigOverride;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.junit.ClassRule;
import org.junit.Test;
import uk.gov.ReBuildSystemsSampleJavaAppApplication;
import uk.gov.ReBuildSystemsSampleJavaAppConfiguration;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldIntegrationTest {

    @ClassRule
    public static final DropwizardAppRule<ReBuildSystemsSampleJavaAppConfiguration> appRule =
            new DropwizardAppRule<>(ReBuildSystemsSampleJavaAppApplication.class,
                    "config.yml",
                    ConfigOverride.config("server.applicationConnectors[0].port", "0"),
                    ConfigOverride.config("server.adminConnectors[0].port", "0")
            );

    private final Client client = JerseyClientBuilder.createClient();

    @Test
    public void shouldReturnHelloWorld() {
        final String resourceUri = String.format("http://localhost:%d/", appRule.getLocalPort());
        final Response response = client.target(resourceUri).request().get();
        assertThat(response.getStatus()).isEqualTo(200);
        assertThat(response.readEntity(String.class)).isEqualTo("Hello world!");
    }

}
