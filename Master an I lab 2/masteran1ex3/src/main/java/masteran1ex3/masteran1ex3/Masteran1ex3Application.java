package masteran1ex3.masteran1ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import masteran1ex3.masteran1ex3.aspects.MyService;

@SpringBootApplication
public class Masteran1ex3Application implements CommandLineRunner {

    @Autowired
    MyService myService;

    /**
     * JointPoint
     * PointCut
     * Advice(Before advice,
     * After returning advice,
     * After throwing advice,
     * After advice,
     * Around advice)
     */

    public static void main(String[] args) {
        SpringApplication.run(Masteran1ex3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myService.getUpperCaseName("costin"));
        System.out.println(myService.getLowerCaseName("COSTIN"));
    }
}
