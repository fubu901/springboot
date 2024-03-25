package com.example.esercizio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Esercizio2Application {

    public static void main(String[] args) {
        SpringApplication.run(Esercizio2Application.class, args);
    }

    @GetMapping("/v2/ciao/Lombardia")
    public OggettoJSON saluta(@RequestParam String nome) {
        OggettoJSON risposta = new OggettoJSON();
        risposta.setMessaggio("Ciao " + nome + ", com'è il tempo in Lombardia?");
        return risposta;
    }

    static class OggettoJSON {
        private String messaggio;

        public String getMessaggio() {
            return messaggio;
        }

        public void setMessaggio(String messaggio) {
            this.messaggio = messaggio;
        }
    }
}

