package zimmermannWebtech.TripPlaner.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping(path = "/")
    public ModelAndView showindexPage(){
        return new ModelAndView("index");
    }

}