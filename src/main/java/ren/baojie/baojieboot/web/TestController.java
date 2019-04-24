package ren.baojie.baojieboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String hello(String hello) {
        return "you enter " + hello;
    }
}
