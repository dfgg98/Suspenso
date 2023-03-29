package com.examenRecuperacion.ExamenRecuperacion.repository;

import com.examenRecuperacion.ExamenRecuperacion.model.Parqueadero;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParqueaderoRepository extends MongoRepository<Parqueadero,Long> {
}
