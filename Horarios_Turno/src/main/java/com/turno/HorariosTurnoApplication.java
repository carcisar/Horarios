package com.turno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EntityScan(basePackages = {"com.empleados.entity", "com.asignacion.entity", "com.turno.entity"})
public class HorariosTurnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorariosTurnoApplication.class, args);
	}

}
