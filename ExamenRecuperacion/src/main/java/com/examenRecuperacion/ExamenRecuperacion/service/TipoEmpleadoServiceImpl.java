package com.examenRecuperacion.ExamenRecuperacion.service;

import com.examenRecuperacion.ExamenRecuperacion.model.TipoEmpleado;
import com.examenRecuperacion.ExamenRecuperacion.repository.TipoEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoEmpleadoServiceImpl extends GenericServiceImpl<TipoEmpleado,Long> implements TipoEmpladoService {
    @Autowired
    TipoEmpleadoRepository tipoEmpleadoRepository;
    @Override
    public CrudRepository<TipoEmpleado, Long> getDao() {
        return tipoEmpleadoRepository;
    }
}
