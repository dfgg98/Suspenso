package com.examenRecuperacion.ExamenRecuperacion.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Getter
@Setter
@Document(collection = "parqueadero")
public class Parqueadero {
    private String nombre;
    private String n_plazas;
    private String descripcion;
   private  List<Empleado> listEmpleados;
    private Fabrica fabrica;

}
