package com.example.bloom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {








    @GetMapping("/index")
    public void gomain() {
    }

    @GetMapping("/")
    public String defaultLocation() {
        return "index";
    }

    @GetMapping("regist")
    public String regist(){
        return "regist/registCategory";
    }

    @GetMapping("test")
    public String test(){

        return "psychological/firstTest";
    }
    @GetMapping("start")
    public String test1(){

        return "psychological/testStart";
    }
}
