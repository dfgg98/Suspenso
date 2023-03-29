package com.examenRecuperacion.ExamenRecuperacion.service;

import com.examenRecuperacion.ExamenRecuperacion.model.Empleado;
import com.examenRecuperacion.ExamenRecuperacion.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado,Long> implements EmpleadoService{
    @Autowired
    EmpleadoRepository empleadoRepository;
    @Override
    public CrudRepository<Empleado, Long> getDao() {
        return empleadoRepository;
    }
}
