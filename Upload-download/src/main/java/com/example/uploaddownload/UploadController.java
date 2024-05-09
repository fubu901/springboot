package com.example.uploaddownload;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@RestController
public class UploadController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // Controlla se il file non è vuoto
            if (file.isEmpty()) {
                return ResponseEntity.badRequest().body("Il file è vuoto");
            }

            // Percorso di destinazione per il caricamento del file
            String uploadPath = "upload-dir/" + file.getOriginalFilename();

            // Crea uno stream di input e output per copiare il file sul server
            try (InputStream inputStream = file.getInputStream();
                 OutputStream outputStream = new FileOutputStream(uploadPath)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }

            return ResponseEntity.ok().body("File caricato con successo: " + file.getOriginalFilename());
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Errore durante il caricamento del file");
        }
    }
}
