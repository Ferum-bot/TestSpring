package com.Ferumbot.github.TestSpring.configurations

import com.Ferumbot.github.TestSpring.entities.Employee
import com.Ferumbot.github.TestSpring.repositories.EmployeeRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LoadDatabase {

    companion object {

        private val logger = LoggerFactory.getLogger(LoadDatabase::class.java)
    }

    @Bean
    fun initDatabase(repository: EmployeeRepository): CommandLineRunner {

        val first = Employee("Matvey", "CTO")
        val second = Employee("Stas", "Front-end")

        return CommandLineRunner { args ->
            logger.info("Preloading ${repository.save(first)}")
            logger.info("Preloading ${repository.save(second)}")
        }
    }
}