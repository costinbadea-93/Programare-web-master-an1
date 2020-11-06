package masteran1lab3ex1.masteran1lab3ex1.repository;

import masteran1lab3ex1.masteran1lab3ex1.model.Persoana;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MyRepository {
    private static final Logger logger = LoggerFactory.getLogger(MyRepository.class);
    private static List<Persoana> persoane = new ArrayList<>();

    public MyRepository(){
        persoane.add(new Persoana("Ionel","Georgescu", "23"));
        persoane.add(new Persoana("Dorel","Ionescu", "24"));
        persoane.add(new Persoana("Gabriel","Popescu", "25"));
    }

    public List<Persoana> getPersoane(){
        logger.info("Se vor preluad din repo datele: {}", persoane);
        return persoane;
    }

    public void addPersoana(Persoana persoana) {
        logger.info("Vom adauga in lista pesroana: {}", persoana);
        persoane.add(persoana);
    }

    public void deletePersoana(String nume){
        logger.info("S-a sters persoana cu numele: {}", nume);
        persoane = persoane.stream()
                .filter(p -> !p.getNume().equals(nume))
                .collect(Collectors.toList());

    }
}
