import config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MyService;

public class Main {
    public static void main(String[] args) {
        /**
         * singleton // default scope
         * prototype // many instances per context
         * ======================================
         * request
         * session
         * global session
         */
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        System.out.println("Context was retrieved!!!!");
        MyService myService = applicationContext.getBean(MyService.class);
        myService.setMessage("some random message!!!");
        System.out.println(myService.getMessage());
        System.out.println(myService.hashCode());

        MyService myService1 = applicationContext.getBean(MyService.class);
        System.out.println(myService1.getMessage());
        System.out.println(myService1.hashCode());

    }
}
