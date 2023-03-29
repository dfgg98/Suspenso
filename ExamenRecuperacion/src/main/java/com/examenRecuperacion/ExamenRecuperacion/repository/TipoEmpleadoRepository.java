package com.examenRecuperacion.ExamenRecuperacion.repository;

import com.examenRecuperacion.ExamenRecuperacion.model.TipoEmpleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TipoEmpleadoRepository extends MongoRepository <TipoEmpleado,Long> {
}
