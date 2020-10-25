package serviceImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.MyInterface;

@Service
@Qualifier("en")
public class MyInterfaceImplEn implements MyInterface {
    @Override
    public void saySomething() {
        System.out.println("Hello!!!");
    }
}
