package com.christianoguedes.hazelcastexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class HazelcastExampleApplication

fun main(args: Array<String>) {
	runApplication<HazelcastExampleApplication>(*args)
}
