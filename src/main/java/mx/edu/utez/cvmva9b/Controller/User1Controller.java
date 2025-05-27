package mx.edu.utez.cvmva9b.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class User1Controller {
    @GetMapping("")
    public String getMessage() {
        return "hola desde user1";
    }
}