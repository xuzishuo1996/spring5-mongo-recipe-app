package guru.springframework.spring5mongorecipeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class Spring5MongoRecipeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5MongoRecipeAppApplication.class, args);
    }
}
