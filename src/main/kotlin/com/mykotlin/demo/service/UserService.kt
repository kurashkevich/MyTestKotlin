package com.mykotlin.demo.service

import com.mykotlin.demo.domain.User
import com.mykotlin.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {
    @Autowired
    lateinit var userRepository: UserRepository

    fun getUsers(): Iterable<User>{
        return userRepository.findAll()
    }

    fun findById(id:Long): User{
        return userRepository.findUserById(id)
    }
}