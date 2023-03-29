package com.examenRecuperacion.ExamenRecuperacion.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Getter
@Setter
@Document(collection = "fabrica")
public class Fabrica {
    private String nombre;
    private String ruc;
    private String direccion;

    private List<Empleado> listEmpleados;
private Parqueadero parqueadero;
}
