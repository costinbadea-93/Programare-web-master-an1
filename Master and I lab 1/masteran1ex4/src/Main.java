import config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MyInterface;
import servicecall.CallService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        CallService callService = context.getBean(CallService.class);
        callService.writeMsg();

    }
}
