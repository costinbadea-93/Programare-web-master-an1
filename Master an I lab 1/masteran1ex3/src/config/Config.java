package config;

import model.Persoana;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"service"})
public class Config {

    @Bean
    @Qualifier("Ionel")
    Persoana p1(){
        return new Persoana("Ionel");
    }

    @Bean
    @Qualifier("Gigel")
    Persoana p2(){
        return new Persoana("Gigel");
    }
}
