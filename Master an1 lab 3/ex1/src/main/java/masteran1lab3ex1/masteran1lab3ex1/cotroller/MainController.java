package masteran1lab3ex1.masteran1lab3ex1.cotroller;

import masteran1lab3ex1.masteran1lab3ex1.repository.MyRepository;
import masteran1lab3ex1.masteran1lab3ex1.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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
    public  String goAndAdd() {
        return "adaugaPersoana";
    }
}
