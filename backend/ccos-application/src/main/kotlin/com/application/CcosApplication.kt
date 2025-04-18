package com.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CcosApplication

fun main(args: Array<String>) {
    runApplication<CcosApplication>(*args)
}
