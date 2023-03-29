package com.examenRecuperacion.ExamenRecuperacion.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document(collection = "tipoEmpleado")
public class TipoEmpleado {
    private String nombrePuesto;
    private String descripcion;
}
