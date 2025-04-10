package com.ssg.springex.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class SampleController {

    @GetMapping("/hello")
    public void hello(){
        log.info("hello...web...mvc...spring........");
    }

}
