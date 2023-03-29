package com.examenRecuperacion.ExamenRecuperacion.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Getter
@Setter
@Document(collection = "empleado")
public class Empleado {
    private  String nombre;
    private  String apellido;
    private  String celular;
    private  String correo;
    private  String direccion;
private List<Maquina> listMaquina;
private  TipoEmpleado tipoEmpleado;

}
