package guru.springframework.spring5jokesappv2;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
@Configuration
@SpringBootApplication
public class Spring5JokesAppV2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Spring5JokesAppV2Application.class, args);
        JokeService service = (JokeService) context.getBean("chuckNorrisJokeService");
        System.out.println(service.getJoke());
    }
}
