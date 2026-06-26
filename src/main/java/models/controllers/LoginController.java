package models.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    //TODO Create login controller.
    //TODo Create login page. Have login page connect to Login controller.

    /**
     * Shows login page.
     *
     * @return displays login page.
     * */
    @GetMapping("/")
    public String loginPage(){
        return "login-page";
    }
}
