package com.examenRecuperacion.ExamenRecuperacion.controler;

import com.examenRecuperacion.ExamenRecuperacion.model.Fabrica;
import com.examenRecuperacion.ExamenRecuperacion.service.FabricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/fabrica")
public class FabricaControllers {
    @Autowired
    FabricaService fabricaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Fabrica>> listarFabrica() {
        return new ResponseEntity<>(fabricaService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Fabrica> crearFabrica(
            @RequestBody Fabrica f) {
        return new ResponseEntity<>(fabricaService.save(f),
                HttpStatus.CREATED);
    }
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Fabrica> actualizarFabrica(@PathVariable Long id, @RequestBody Fabrica f) {
        Fabrica fabricaEncontradas = fabricaService.findById(id);
        if (fabricaEncontradas == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                fabricaEncontradas.setNombre(f.getNombre());
                fabricaEncontradas.setRuc(f.getRuc());
                fabricaEncontradas.setDireccion(f.getDireccion());
                return new ResponseEntity<>(fabricaService.save(f), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Fabrica> eliminarFabrica(@PathVariable Long id) {
        fabricaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}