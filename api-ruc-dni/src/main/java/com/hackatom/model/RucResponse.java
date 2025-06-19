package com.hackatom.model;

import lombok.Data;
import java.util.List;

@Data
public class RucResponse {
    private String ruc;
    private String razonSocial;
    private String nombreComercial;
    private List<String> telefonos;
    private String estado;
    private String condicion;
    private String direccion;
    private String departamento;
    private String provincia;
    private String distrito;
    private String ubigeo;
    private String capital;
}
