package masteran1ex2.masteran1ex2.controller;

import masteran1ex2.masteran1ex2.service.MyService;
import masteran1ex2.masteran1ex2.service.MyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {
    @Autowired
    MyServiceInterface myService;

    @GetMapping("/")
    public  String index(Model model) {
        model.addAttribute("number", myService.getValue());
        return "index";
    }

}
