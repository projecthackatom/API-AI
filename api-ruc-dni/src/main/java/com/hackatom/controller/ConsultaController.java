package com.hackatom.controller;

import com.hackatom.model.DniResponse;
import com.hackatom.model.RucResponse;
import com.hackatom.service.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/consulta")
@RequiredArgsConstructor
@CrossOrigin
public class ConsultaController {

    private final ConsultaService consultaService;

    @GetMapping("/dni/{dni}")
    public Mono<DniResponse> consultarDni(@PathVariable String dni) {
        return consultaService.consultarDni(dni);
    }

    @GetMapping("/ruc/{ruc}")
    public Mono<RucResponse> consultarRuc(@PathVariable String ruc) {
        return consultaService.consultarRuc(ruc);
    }
}
