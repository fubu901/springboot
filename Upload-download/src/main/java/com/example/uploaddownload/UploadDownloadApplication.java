package com.example.uploaddownload;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;

@SpringBootApplication
public class UploadDownloadApplication {

    public static void main(String[] args) {
        createUploadDirectory();
        SpringApplication.run(UploadDownloadApplication.class, args);
    }

    private static void createUploadDirectory() {
        String uploadDirPath = System.getProperty("user.dir") + File.separator + "upload-dir";
        File uploadDir = new File(uploadDirPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }
    }
}
