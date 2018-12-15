package com.mykotlin.demo.repository

import com.mykotlin.demo.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long>{
    fun findUserById(id:Long) : User
}
