package com.mykotlin.demo.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User (
    @Id
    @GeneratedValue
    val id:Long,
    val firstName:String,
    val lastName:String
)