package nl.oliveira.kafkaspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaSpringBootApplication

fun main(args: Array<String>) {
	runApplication<KafkaSpringBootApplication>(*args)
}
