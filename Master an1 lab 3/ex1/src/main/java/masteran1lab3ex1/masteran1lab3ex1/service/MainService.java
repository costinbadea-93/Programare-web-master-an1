package masteran1lab3ex1.masteran1lab3ex1.service;

import masteran1lab3ex1.masteran1lab3ex1.model.Persoana;
import masteran1lab3ex1.masteran1lab3ex1.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private MyRepository myRepository;

    public List<Persoana> getPersoane(){
        return myRepository.getPersoane();
    }

    public void addPersoana(Persoana persoana) {
        myRepository.addPersoana(persoana);
    }

    public void deletePersoana(String nume) {
        myRepository.deletePersoana(nume);
    }
}
