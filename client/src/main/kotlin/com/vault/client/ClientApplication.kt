package com.vault.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ClientApplication

fun main(args: Array<String>) {
	runApplication<ClientApplication>(*args)
}
