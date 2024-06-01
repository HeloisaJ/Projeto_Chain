package br.com.api.chain.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.chain.entities.EngenheiroDeSoftware;
import br.com.api.chain.repositories.EngenheiroDeSoftwareRepository;
import br.com.api.chain.services.EngenheiroDeSoftwareService;

@RestController
@RequestMapping("/users")
public class EngenheiroDeSoftwareController {

    private final EngenheiroDeSoftwareService usuarioService;

    @Autowired
    public EngenheiroDeSoftwareController(EngenheiroDeSoftwareService usuarioService){
        this.usuarioService = usuarioService;
    }

    /*@GetMapping("/")
    public List<EngenheiroDeSoftware> engenheiroDeSoftwares(){
        return usuarioRepositorio.findAll();
    }*/

    @GetMapping("/{email}")
    public ResponseEntity<EngenheiroDeSoftware> getUserByEmail(@PathVariable String email){
        EngenheiroDeSoftware eng = usuarioService.getUserByEmail(email);
        return ResponseEntity.ok().body(eng);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<EngenheiroDeSoftware> getUserById(@PathVariable Integer id){
        EngenheiroDeSoftware eng = usuarioService.getUserById(id);
        return ResponseEntity.ok().body(eng);
    }
}