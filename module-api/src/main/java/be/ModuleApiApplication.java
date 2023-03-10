package be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleApiApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application,application-rds,application-redis");
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}

