package mx.edu.utez.cvmva9b.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user2/")
@CrossOrigin("*")
public class UserController2 {
    @GetMapping("")
    public String getMessage() {
        return "hola desde user1";
    }
}
