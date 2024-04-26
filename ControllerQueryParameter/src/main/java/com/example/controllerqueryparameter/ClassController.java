package com.example.controllerqueryparameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {

    @GetMapping("/v1/ciao")
    public String ciao(@RequestParam String nome, @RequestParam String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}

