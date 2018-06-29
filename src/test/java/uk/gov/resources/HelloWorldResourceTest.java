package uk.gov.resources;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldResourceTest {

    @Test
    public void resourceShouldGiveHelloWorld() {
        HelloWorldResource helloWorldResource = new HelloWorldResource();
        assertThat(helloWorldResource.sayHello(), equalTo("Hello world!"));
    }
}
