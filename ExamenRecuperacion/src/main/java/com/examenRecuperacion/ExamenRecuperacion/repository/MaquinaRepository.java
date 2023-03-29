package com.examenRecuperacion.ExamenRecuperacion.repository;

import com.examenRecuperacion.ExamenRecuperacion.model.Maquina;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaquinaRepository  extends MongoRepository<Maquina,Long> {
}
