package masteran1ex3.masteran1ex3.aspects;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String getLowerCaseName(String name) {
        return name.toLowerCase();
    }

    public String getUpperCaseName(String name) {
        return name.toUpperCase();
    }
}
