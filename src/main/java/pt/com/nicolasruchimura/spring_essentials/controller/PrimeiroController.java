package pt.com.nicolasruchimura.spring_essentials.controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/home")

public class PrimeiroController {
    //Primeiro EndPoint
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String get(){
        return "This is GeT .";
    }

    //Segundo EndPoint
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String get1(){
        return "This is PosT .";
    }
}
