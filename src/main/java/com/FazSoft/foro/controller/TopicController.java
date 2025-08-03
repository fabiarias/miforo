package com.FazSoft.foro.controller;

import com.FazSoft.foro.topico.DatosActualizarTopic;
import com.FazSoft.foro.topico.DatosRegistroTopico;
import com.FazSoft.foro.topico.Topic;
import com.FazSoft.foro.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {


    @Autowired
    private TopicoRepository repository;

    @Transactional
    @PostMapping
    public void register(@RequestBody DatosRegistroTopico datos){

        repository.save(new Topic(datos));
    }

    @GetMapping
    public List<Topic> listar(){
       return repository.findAll();
    }

    @Transactional
    @PutMapping
    public void actualizar(@RequestBody DatosActualizarTopic datos){
        var topic = repository.getReferenceById(datos.id());
        topic.actualizarTopicos(datos);

    }

    @DeleteMapping
    @Transactional("/{id}")
    public void eliminar(@PathVariable Long id){
        repository.deleteById(id);
    }

    
}
