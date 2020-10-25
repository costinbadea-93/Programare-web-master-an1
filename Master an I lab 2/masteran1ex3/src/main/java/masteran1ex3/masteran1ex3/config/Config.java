package masteran1ex3.masteran1ex3.config;

import masteran1ex3.masteran1ex3.aspects.MyAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class Config {
    @Bean
    MyAspect myAspect() {
        return new MyAspect();
    }
}
