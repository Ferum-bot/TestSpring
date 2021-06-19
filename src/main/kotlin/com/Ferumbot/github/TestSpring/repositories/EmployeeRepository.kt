package com.Ferumbot.github.TestSpring.repositories

import com.Ferumbot.github.TestSpring.entities.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository: JpaRepository<Employee, Long> {
}