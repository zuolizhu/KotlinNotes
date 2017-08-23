package com.zuolizhu.KotlinNotes

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue

@SpringBootApplication
class KotlinNotesApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinNotesApplication::class.java, *args)
}

@Entity
data class Note(@Id @GeneratedValue var id: Long? = null,
                var text: String? = null, var user: String? = null)
