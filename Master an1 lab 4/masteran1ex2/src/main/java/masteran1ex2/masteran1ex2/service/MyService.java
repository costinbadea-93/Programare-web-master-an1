package masteran1ex2.masteran1ex2.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.Random;

@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.INTERFACES)
public class MyService implements MyServiceInterface{
    private final int value;

    public MyService() {
        this.value = new Random().nextInt(1000);
    }

    @Override
    public  int getValue() {
        return  value;
    }
}
