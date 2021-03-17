package com.github.imloama.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudGatewayNativeApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudGatewayNativeApplication>(*args)
}
