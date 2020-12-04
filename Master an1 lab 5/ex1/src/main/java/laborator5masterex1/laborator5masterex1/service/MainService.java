package laborator5masterex1.laborator5masterex1.service;

import laborator5masterex1.laborator5masterex1.model.Masina;
import laborator5masterex1.laborator5masterex1.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;

    public List<Masina> getMasini() {
        return mainRepository.getMasini();
    }

    public List<Masina> adaugaMasina(Masina masina) {
       return mainRepository.adaugaMasina(masina);
    }

    public List<Masina> stergerMasina(String marca) {
        return mainRepository.stergerMasina(marca);
    }

    public Masina masinaDupaMarca(String marca) {
        return mainRepository.masinaDupaMarca(marca);
    }
}
