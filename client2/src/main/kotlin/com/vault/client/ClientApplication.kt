package com.vault.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClientApplication

fun main(args: Array<String>) {
	runApplication<ClientApplication>(*args)
}
//curl -X POST http://localhost:8080/actuator/busrefresh