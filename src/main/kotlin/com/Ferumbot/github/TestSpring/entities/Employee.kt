package com.Ferumbot.github.TestSpring.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Employee(
    @Id
    @GeneratedValue
    val id: Long,

    val name: String,

    val role: String,
) {

    constructor(name: String, role: String) : this(
        UUID.randomUUID().timestamp(), name, role
    )
}