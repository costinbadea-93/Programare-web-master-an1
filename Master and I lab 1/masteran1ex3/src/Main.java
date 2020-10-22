import config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MyService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        MyService service = context.getBean(MyService.class);
        service.printPersoana();
    }
}
