package com.examenRecuperacion.ExamenRecuperacion.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document(collection = "maquina")
public class Maquina {
    private String nombre;
    private String marca;
    private String modelo;
    private Double precio;
    private String descripcion;
}
