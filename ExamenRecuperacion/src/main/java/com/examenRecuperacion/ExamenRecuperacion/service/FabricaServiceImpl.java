package com.examenRecuperacion.ExamenRecuperacion.service;

import com.examenRecuperacion.ExamenRecuperacion.model.Fabrica;
import com.examenRecuperacion.ExamenRecuperacion.repository.FabricaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class FabricaServiceImpl extends  GenericServiceImpl <Fabrica,Long> implements  FabricaService{
    @Autowired
    FabricaRepository fabricaRepository;
    @Override
    public CrudRepository<Fabrica, Long> getDao() {
        return fabricaRepository;
    }
}
