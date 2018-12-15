package com.mykotlin.demo.controller.user;

import com.mykotlin.demo.domain.User;
import com.mykotlin.demo.service.JavaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java")
public class JavaUserController {
    @Autowired
    private JavaUserService javaUserService;


    @GetMapping("/")
    public String helloJava(){
        return "hello from java";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id")Long id){
        User user = javaUserService.findById(id);
        System.out.println(user);
        return user;
    }


}
