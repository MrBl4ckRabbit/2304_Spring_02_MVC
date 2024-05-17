package by.itclass.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFirstSuperMVCController {
   // @RequestMapping(method = RequestMethod.GET, value = "/toIndex")
    @GetMapping(value = "/toIndex")
    public String showIndexPage() {
        return "index";
    }

}

