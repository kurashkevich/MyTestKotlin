package com.mykotlin.demo.service;

import com.mykotlin.demo.domain.User;
import com.mykotlin.demo.repository.JavaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JavaUserService {
    private JavaUserRepository javaUserRepository;

    @Autowired
    public void setJavaUserRepository(JavaUserRepository javaUserRepository) {
        this.javaUserRepository = javaUserRepository;
    }

    public User findByIdTst(Long id){
        return javaUserRepository.findUserById(id);
    }

    public Optional<User> getByIdOutOfTheBox(Long id){
        return javaUserRepository.findById(id);
    }
}
