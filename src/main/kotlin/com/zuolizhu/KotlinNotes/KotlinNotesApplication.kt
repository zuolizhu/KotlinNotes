package com.zuolizhu.KotlinNotes

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinNotesApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinNotesApplication::class.java, *args)
}
