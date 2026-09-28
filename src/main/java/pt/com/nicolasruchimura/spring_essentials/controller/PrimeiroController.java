package pt.com.nicolasruchimura.spring_essentials.controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/v1/home")

public class PrimeiroController {
    //Primeiro EndPoint
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String get(){
        return "You're in Home Page!";
    }

    //Segundo EndPoint
    @GetMapping("/dashboard")
    @ResponseStatus(HttpStatus.OK)
    public String get1(){
        return "This is dashboard lobby.";
    }
}
