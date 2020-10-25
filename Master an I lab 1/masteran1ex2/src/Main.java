import config.Config;
import model.Persoana;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
              new AnnotationConfigApplicationContext(Config.class);

        Persoana persoana = context.getBean(Persoana.class);
        Persoana persoana1 = (Persoana) context.getBean("p1");
        System.out.println("Listing data: ");
        System.out.println(persoana);
        System.out.println(persoana1);
    }
}
