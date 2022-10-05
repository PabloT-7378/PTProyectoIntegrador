package com.ptportfolio.pablot.controller;

import com.ptportfolio.pablot.dto.DtoProyectos;
import com.ptportfolio.pablot.models.Proyectos;
import com.ptportfolio.pablot.security.controller.Mensaje;
import com.ptportfolio.pablot.service.ProyectosService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://frontendpt-1.web.app")
@RequestMapping("/proyectos")
public class ProyectosController {
    @Autowired ProyectosService proyectosService;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> list() {
        List<Proyectos> list = proyectosService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") int id) {
        if(!proyectosService.existsById(id))
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        
        Proyectos proyectos = proyectosService.getOne(id).get();
        return new ResponseEntity(proyectos, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if(!proyectosService.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        proyectosService.delete(id);
        return new ResponseEntity(new Mensaje("Proyectos eliminados"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoProyectos dtoProyectos) {
        if(StringUtils.isBlank(dtoProyectos.getNombreProyec()))
            return new ResponseEntity(new Mensaje("Nombre obligatorio"), HttpStatus.BAD_REQUEST);
        if(proyectosService.existsByNombreProyec(dtoProyectos.getNombreProyec()))
            return new ResponseEntity(new Mensaje("Proyecto ya existe"), HttpStatus.BAD_REQUEST);
        
        Proyectos proyectos = new Proyectos(dtoProyectos.getNombreProyec(), dtoProyectos.getDescProyec());
        proyectosService.save(proyectos);
        
        return new ResponseEntity(new Mensaje("Proyecto agregado"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoProyectos dtoProyectos) {
        if(!proyectosService.existsById(id))
            return new ResponseEntity(new Mensaje("ID no existe"), HttpStatus.BAD_REQUEST);
        
        if(proyectosService.existsByNombreProyec(dtoProyectos.getNombreProyec()) && proyectosService.getByNombreProyec(dtoProyectos.getNombreProyec()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Proyecto ya existe"), HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isBlank(dtoProyectos.getNombreProyec()))
            return new ResponseEntity(new Mensaje("Nombre obligatorio"), HttpStatus.BAD_REQUEST);
        
        Proyectos proyectos = proyectosService.getOne(id).get();
        proyectos.setNombreProyec(dtoProyectos.getNombreProyec());
        proyectos.setDescProyec(dtoProyectos.getDescProyec());
                
        proyectosService.save(proyectos);
        return new ResponseEntity(new Mensaje("Proyectos actualizados"), HttpStatus.OK);
    }
}
