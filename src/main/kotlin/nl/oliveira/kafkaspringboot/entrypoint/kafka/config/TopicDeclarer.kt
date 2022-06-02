package nl.oliveira.kafkaspringboot.entrypoint.kafka.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Configuration

@Configuration
class TopicDeclarer(private val configurableBeanFactory: ConfigurableBeanFactory) {
    fun declare(topics: List<NewTopic>) {
        topics.forEach { topic -> register(topic) }
    }

    fun register(topic: NewTopic) {
        configurableBeanFactory.registerSingleton(topic.name(), topic)
    }
}