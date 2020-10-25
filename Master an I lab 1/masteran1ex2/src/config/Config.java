package config;

import model.Persoana;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class Config {

    @Bean
    Persoana p1() {
        return new Persoana("Costin", "27");
    }
}
