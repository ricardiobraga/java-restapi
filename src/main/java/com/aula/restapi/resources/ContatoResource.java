package com.aula.restapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.restapi.entities.Contato;
import com.aula.restapi.repositories.ContatoRepository;

@RestController
@RequestMapping("/contato")
public class ContatoResource {

    @Autowired
    private ContatoRepository repository;

    @GetMapping
    public List<Contato>list(){
        return repository.findAll();
    }    

    @PostMapping
    public void save(@RequestBody Contato contato){
        repository.save(contato);
    }

    @PutMapping
    public void update(@RequestBody Contato contato){
        if(contato.getId() > 0){
            repository.save(contato);
        }
    }

    @DeleteMapping
    public void delete(@RequestBody Contato contato){
        repository.delete(contato);
    }

}
