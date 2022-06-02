package nl.oliveira.kafkaspringboot.entrypoint.config

import nl.oliveira.kafkaspringboot.entrypoint.kafka.BebTopic
import nl.oliveira.kafkaspringboot.entrypoint.kafka.config.TopicDeclarer
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.EnableKafka

@EnableKafka
@Configuration
class KafkaConsumerConfig(private val topicDeclarer: TopicDeclarer): InitializingBean {

    override fun afterPropertiesSet() {
        topicDeclarer.declare(BebTopic.getTopics())
    }

}