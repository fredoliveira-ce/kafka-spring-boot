package nl.oliveira.kafkaspringboot.entrypoint.kafka

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.kafka.config.TopicBuilder

enum class BebTopic(private val topic: NewTopic) {

    USER_CREATED(TopicBuilder
            .name("user.changed")
            .partitions(10)
            .build()),

    USER_STATUS_CHANGED(TopicBuilder
            .name("user-status.changed")
            .partitions(10)
            .build());

    companion object {
        fun getTopics(): List<NewTopic> {
            return values().map { it.topic }
        }
    }
}
