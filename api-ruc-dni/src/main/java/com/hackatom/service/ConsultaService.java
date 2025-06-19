package com.hackatom.service;

import com.hackatom.model.DniResponse;
import com.hackatom.model.RucResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ConsultaService {

    private final WebClient webClient = WebClient.create("https://dniruc.apisperu.com/api/v1");
    private final String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6ImhhY2thdG9tcHJvamVjdEBnbWFpbC5jb20ifQ.XhRFApR9pmy2pJYE0_MK9WcJlI6hPir_qFSIRARSAOE";

    public Mono<DniResponse> consultarDni(String dni) {
        return webClient.get()
                .uri("/dni/{dni}?token={token}", dni, token)
                .retrieve()
                .bodyToMono(DniResponse.class);
    }

    public Mono<RucResponse> consultarRuc(String ruc) {
        return webClient.get()
                .uri("/ruc/{ruc}?token={token}", ruc, token)
                .retrieve()
                .bodyToMono(RucResponse.class);
    }
}
