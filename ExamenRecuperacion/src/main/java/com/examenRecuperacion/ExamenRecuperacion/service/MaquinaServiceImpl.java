package com.examenRecuperacion.ExamenRecuperacion.service;

import com.examenRecuperacion.ExamenRecuperacion.model.Maquina;
import com.examenRecuperacion.ExamenRecuperacion.repository.MaquinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class MaquinaServiceImpl extends GenericServiceImpl <Maquina,Long> implements MaquinaService {

     @Autowired
    MaquinaRepository maquinaRepository;
    @Override
    public CrudRepository<Maquina, Long> getDao() {
        return maquinaRepository;
    }
}
