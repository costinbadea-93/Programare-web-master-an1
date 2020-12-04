package laborator5masterex1.laborator5masterex1.repository;

import laborator5masterex1.laborator5masterex1.model.Masina;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MainRepository  {

    private static final Logger logger = LoggerFactory.getLogger(MainRepository.class);
    private static List<Masina> masini = new ArrayList<>();

    public MainRepository() {
//        masini.add(Masina.builder()
//                .marca("BMW")
//                .culoare("Negru")
//                .taraDeProvenienta("Germania")
//                .build());
        masini.add(new Masina("Audi","Rosu", "Anglia"));
        masini.add(new Masina("Porche","Alb", "Franta"));
    }

    public List<Masina> getMasini() {
        logger.info("Se vor prelua din repo masinile: {}", masini);
        return masini;
    }

    public List<Masina> adaugaMasina(Masina masina) {
        masini.add(masina);
        logger.info("S-a adaugat la lista masina: {}", masina);
        return masini;
    }


    public List<Masina> stergerMasina(String marca) {
        masini = masini.stream()
                .filter(masina -> !masina.getMarca().equals(marca))
                .collect(Collectors.toList());
        logger.info("S-a sters din lista masina cu marca: {}", marca);
        return masini;
    }

    public Masina masinaDupaMarca(String marca) {
        logger.info("S-a cerut masina cu marca: {}", marca);
        return masini.stream()
                .filter(masina -> masina.getMarca().equals(marca))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Masina cautata nu exista!!!"));
    }
}
