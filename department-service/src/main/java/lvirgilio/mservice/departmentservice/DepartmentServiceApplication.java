package lvirgilio.mservice.departmentservice;

import lvirgilio.mservice.departmentservice.controller.DepartmentController;
import lvirgilio.mservice.departmentservice.repository.DepartmentRepository;
import lvirgilio.mservice.departmentservice.service.DepartmentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
