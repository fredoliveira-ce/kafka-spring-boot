package nl.oliveira.kafkaspringboot.entrypoint.kafka.consumer.user

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class UserMdb {

    @KafkaListener(id = "user", topics = ["user.changed"])
    fun listen(value: String?) {
        println(value)
    }

    @KafkaListener(id = "user-status", topics = ["user-status.changed"])
    fun listenStatus(value: String?) {
        println(value)
    }
}