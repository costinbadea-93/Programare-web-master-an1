package masteran1lab3ex1.masteran1lab3ex1.cotroller;

import masteran1lab3ex1.masteran1lab3ex1.model.Persoana;
import masteran1lab3ex1.masteran1lab3ex1.repository.MyRepository;
import masteran1lab3ex1.masteran1lab3ex1.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    /**
     * @PathVariable => http://localhost:8080/main/Costin
     * @RequestParam =>http://localhost:8080/main?nume=Costin
     * @RequestBody => TO DO
     */

//    @GetMapping("/main")
//    public String main(Model model, @RequestParam String nume) {
//        model.addAttribute("text", "Salut din controller!!! " + nume);
//        return "index";
//    }

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("persoane", mainService.getPersoane());
        return "index";
    }

    @GetMapping("/stergePersoana")
    public String stergePersoana(@RequestParam String numePersoana, Model model){
         mainService.deletePersoana(numePersoana);
         model.addAttribute("persoane", mainService.getPersoane());
         return "index";
    }

    @GetMapping("/goAndAdd")
    public  String goAndAdd(@ModelAttribute("persoana") Persoana persoana,  Model model) {
//        model.addAttribute("persoana", new Persoana());
        return "adaugaPersoana";
    }

//    @PostMapping("/addPersoana")
//    public String adaugaPersoana(@Valid Persoana persoana, BindingResult bindingResult, Model model) {
//        if(bindingResult.hasErrors()) {
//            return "adaugaPersoana";
//        }
//        mainService.addPersoana(persoana);
//        model.addAttribute("persoane", mainService.getPersoane());
//        return "index";
//    }

    @PostMapping("/addPersoana")
    public String adaugaPersoana(@RequestBody Persoana persoana, Model model) {
        mainService.addPersoana(persoana);
        model.addAttribute("persoane", mainService.getPersoane());
        return "index";
    }
}
