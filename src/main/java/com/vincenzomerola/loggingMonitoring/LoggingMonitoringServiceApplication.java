package com.vincenzomerola.loggingMonitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer

public class LoggingMonitoringServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingMonitoringServiceApplication.class, args);
	}

}
