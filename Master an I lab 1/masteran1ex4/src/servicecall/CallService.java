package servicecall;

import jdk.nashorn.internal.codegen.CompilerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import service.MyInterface;

@Service
public class CallService {
    /**
       Autowired => field
                 => constructor
                 => setter
     */
    private final MyInterface myInterface;
//    @Autowired
//    @Qualifier("en")
//    MyInterface myInterface;

    @Autowired
    public CallService(@Qualifier("en") MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    public void writeMsg(){
        myInterface.saySomething();
    }

//    @Autowired
//    public void setMyInterface(@Qualifier("en") MyInterface myInterface) {
//        this.myInterface = myInterface;
//    }
}
