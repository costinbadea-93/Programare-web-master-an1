package laborator5masterex1.laborator5masterex1.controller;

import laborator5masterex1.laborator5masterex1.model.Masina;
import laborator5masterex1.laborator5masterex1.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/masini")
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/get")
    public ResponseEntity<List<Masina>> getMasini() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(mainService.getMasini());
    }

//    @PostMapping("/adaugaMasina")
//    public List<Masina> adaugaMasina(@RequestBody Masina masina) {
//        return mainService.adaugaMasina(masina);
//    }

    @PostMapping("/adaugaMasina")
    public ResponseEntity<List<Masina>> adaugaMasina(@RequestBody Masina masina) {
        return ResponseEntity.created(UriComponentsBuilder
                .fromHttpUrl(ServletUriComponentsBuilder
                        .fromCurrentRequestUri()
                        .toUriString())
                .path("").query("marca={marca}").build(masina.getMarca()))
                .body(mainService.adaugaMasina(masina));

    }
    
    @DeleteMapping("/stergeMasina/{marca}")
    public List<Masina> stergerMasina(@PathVariable String marca) {
        return mainService.stergerMasina(marca);
    }

    @GetMapping("/getMasina")
    public Masina masinaDupaMarca(@RequestParam String marca) {
        return mainService.masinaDupaMarca(marca);
    }
}
