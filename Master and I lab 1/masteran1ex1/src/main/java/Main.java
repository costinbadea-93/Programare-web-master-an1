import model.Persoana;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Persoana persoana = context.getBean(Persoana.class);
        Persoana persoana1 = (Persoana) context.getBean("p1");

        System.out.println("Printing person: ");
        System.out.println(persoana);
        System.out.println("Printing second person: ");
        System.out.println(persoana1);
    }
}
