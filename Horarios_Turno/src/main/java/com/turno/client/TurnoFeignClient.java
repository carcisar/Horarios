package com.turno.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Horarios-Turno", path = "/api/turnos")
public interface TurnoFeignClient {

}
