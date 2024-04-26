package com.example.controllergetcompleta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiaoController {

    @GetMapping("/v2/ciao/{provincia}")
    public Ciao ciao(@PathVariable String provincia, @RequestParam String nome) {
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new Ciao(nome, provincia, saluto);
    }
}

