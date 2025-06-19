package com.hackatom.model;

import lombok.Data;

@Data
public class DniResponse {
    private String dni;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String codVerifica;
}
