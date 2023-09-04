package pl.jakubdrozdz.ff4j.controller;

import org.ff4j.FF4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jakubdrozdz.ff4j.configuration.FF4jConfiguration;

@RestController
public class FF4jDemoController {
    private final FF4j ff4j;

    public FF4jDemoController(FF4j ff4j) {
        this.ff4j = ff4j;
    }

    @GetMapping("/")
    public String get(){
        return ff4j.check(FF4jConfiguration.NEW_API) ? "NEW API" : "OLD API";
    }
}
