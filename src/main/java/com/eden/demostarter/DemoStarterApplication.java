package com.eden.demostarter;

import com.eden.service.LogLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com")
@RestController
public class DemoStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoStarterApplication.class, args);
    }

    @Autowired
    LogLevelService levelService;


    @GetMapping("/test")
    public String testStarter() {
        return levelService.getLogLevel();
    }
}
