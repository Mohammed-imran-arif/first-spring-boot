package com.example.datefinder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {
    @GetMapping("/")
    public String futureDate() {
        LocalDate today = LocalDate.now();
        LocalDate date100 = today.plusDays(100);
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String resultDate100 = date100.format(formatted);
        return resultDate100;
    }
}
