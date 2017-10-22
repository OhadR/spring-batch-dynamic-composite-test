# spring-batch-dynamic-composite-test
spring-batch test app for spring-batch-dynamic-composite

This sample uses spring-boot, and particularly spring-batch-boot.

## spring-boot


The Spring Boot Maven plugin provides many convenient features:

It collects all the jars on the classpath and builds a single, runnable "über-jar", which makes it more convenient to execute and transport your service.
It searches for the public static void main() method to flag as a runnable class.
It provides a built-in dependency resolver that sets the version number to match Spring Boot dependencies. You can override any version you wish, but it will default to Boot’s chosen set of versions.

Spring Boot runs schema-@@platform@@.sql automatically during startup. -all is the default for all platforms.


@SpringBootApplication is a convenience annotation that adds all of the following:

@Configuration tags the class as a source of bean definitions for the application context.
@EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
@ComponentScan tells Spring to look for other components, configurations, and services in the hello package, allowing it to find the controllers.


This application is a spring-batch sample, that is non-web, and configures a job using XML configuration files (old style). The file tasks.ohad.xml configures
the job which is chunk, and configures read, processor and writer.

The reader is a simple file-reader, which is spring-batch' built-in `FlatFileItemReader`.

The processor and writer are the to-be-tested  `DynamicCompositeItemProcessor` and `DynamicCompositeItemWriter` respectively.

## How to run:

C:\...\spring-batch-dynamic-composite-test>mvn clean install

C:\...\spring-batch-dynamic-composite-test>java -jar target\gs-batch-processing-0.1.0.jar