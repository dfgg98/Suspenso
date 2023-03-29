package com.examenRecuperacion.ExamenRecuperacion.service;

import com.examenRecuperacion.ExamenRecuperacion.model.Parqueadero;
import com.examenRecuperacion.ExamenRecuperacion.repository.ParqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ParqueaderoServiceImpl extends  GenericServiceImpl<Parqueadero,Long> implements ParqueaderoService {
    @Autowired
    ParqueaderoRepository parqueaderoRepository;
    @Override
    public CrudRepository<Parqueadero, Long> getDao() {
        return parqueaderoRepository;
    }
}
