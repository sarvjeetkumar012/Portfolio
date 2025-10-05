package in.sarvjeetkumar.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String contactPage() {
        // Thymeleaf template path: src/main/resources/templates/fragments/contact.html
        return "fragments/contact";
    }
}
