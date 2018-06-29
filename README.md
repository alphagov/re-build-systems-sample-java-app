# ReBuildSystemsSampleJavaApp

This is just a dummy app (developed with Java Dropwizard) that exposes an endpoint that simply return the text `Hello world!`.

**DO NOT USE THIS CODE ON PRODUCTION**

How to start the ReBuildSystemsSampleJavaApp application
---

1. Run `mvn clean package` to build your application
1. Start application with `java -jar target/re-build-systems-sample-java-app-1.0.jar server config.yml`
1. To check that your application is running enter url `http://localhost:9000`

Health Check
---

To see your applications health enter url `http://localhost:9001/healthcheck`
