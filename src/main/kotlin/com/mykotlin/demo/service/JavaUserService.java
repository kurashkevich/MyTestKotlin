package com.mykotlin.demo.service;

import com.mykotlin.demo.domain.User;
import com.mykotlin.demo.repository.JavaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaUserService {
    private JavaUserRepository javaUserRepository;

    @Autowired
    public void setJavaUserRepository(JavaUserRepository javaUserRepository) {
        this.javaUserRepository = javaUserRepository;
    }

    public User findById(Long id){
        return javaUserRepository.findUserById(id);
    }
}
