package com.kointosser.kointossershell

import com.kointosser.kointosser.KoinTosser
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KointosserShellApplication {

	@Bean
	fun koinTosser() : KoinTosser {
		return KoinTosser()
	}

}

fun main(args: Array<String>) {
	runApplication<KointosserShellApplication>(*args)
}
