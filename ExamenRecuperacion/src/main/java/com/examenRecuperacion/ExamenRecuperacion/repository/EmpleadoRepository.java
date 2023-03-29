package com.examenRecuperacion.ExamenRecuperacion.repository;

import com.examenRecuperacion.ExamenRecuperacion.model.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpleadoRepository extends MongoRepository<Empleado,Long> {
}
