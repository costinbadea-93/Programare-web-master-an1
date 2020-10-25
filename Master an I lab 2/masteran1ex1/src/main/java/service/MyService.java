package service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
