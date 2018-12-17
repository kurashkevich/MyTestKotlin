package com.mykotlin.demo.controller.user

import com.mykotlin.demo.domain.User
import com.mykotlin.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/all")
    fun getAllUsers(): Iterable<User> {
        return userService.getUsers()
    }

    @GetMapping("/get/{id}")
    fun getUserById(@PathVariable("id") id:Long) : User?{
        return userService.findById(id)
    }

}