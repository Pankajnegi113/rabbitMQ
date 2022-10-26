package com.java.rabbitMQ.consumer;

import com.java.rabbitMQ.config.MessagingConfig;
import com.java.rabbitMQ.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class User {
    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}
