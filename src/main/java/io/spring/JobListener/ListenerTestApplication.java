package io.spring.JobListener;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan("io.spring.JobListener.Configuration")
public class ListenerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListenerTestApplication.class, args);
	}
}
