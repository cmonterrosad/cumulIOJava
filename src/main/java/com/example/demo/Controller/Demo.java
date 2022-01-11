package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class Demo{

    @GetMapping()
    public String getDemo(){
        return "cumul";

    }

    @GetMapping("/v2")
    public String getDemov2(){
        return "index";

    }

}