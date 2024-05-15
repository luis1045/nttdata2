package com.proyecto2.empresas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credit {
    private String tipocredito;
    private String descripcion;
    private int number;
    private BigDecimal deuda;
    private int cuota;
}
