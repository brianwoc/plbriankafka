package pl.brian.kafka.consumer2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Read {

    @KafkaListener(topics = {"horror","sf","drama"})
    public void Read(String message){
        System.out.println(message);

    }
}
