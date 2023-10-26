package com.makaia.rabbitmq.consumer;

import com.makaia.rabbitmq.publisher.Publisher;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    Publisher publisher;

    @Autowired
    public Consumer(Publisher publisher) {
        this.publisher = publisher;
    }

    @RabbitListener(queues = {"${com.makaia.rabbitmq.queue_name}"})
    public void receive(@Payload String message){
        System.out.println("Received message: " + message);
        this.publisher.sendMakaia2("Segundo paso completado. Esta es la informaciòn " + message);
    }

    @RabbitListener(queues = {"makaia2"})
    public void receiveMakaia2(@Payload String message){
        System.out.println(message);
    }


}
