package serviceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.MyInterface;

@Service
@Qualifier("ro")
public class MyInterfaceImplRo implements MyInterface {
    @Override
    public void saySomething() {
        System.out.println("Salut!!!");
    }
}
