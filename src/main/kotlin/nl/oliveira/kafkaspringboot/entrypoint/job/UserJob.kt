package nl.oliveira.kafkaspringboot.entrypoint.job

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class UserJob(private val template: KafkaTemplate<Any, Any>) {

    @Scheduled(fixedDelay = 1000)
    fun scheduleFixedDelayTask() {
        val result = template.send("user.changed", "test").get()
        println(result)

        val result2 = template.send("user-status.changed", "test 2##").get()
        println(result2)
    }
}