package hu.exercise.microservice.DataHandlerServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DataHandlerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataHandlerServerApplication.class, args);
	}
}
