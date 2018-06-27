package hu.exercise.microservice.DataHandlerServer;

import hu.exercise.microservice.DataHandlerServer.client.DataHandlerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients(clients = DataHandlerClient.class)
@EnableDiscoveryClient
@SpringBootApplication
public class DataHandlerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataHandlerServerApplication.class, args);
    }
}
