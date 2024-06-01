package br.com.api.chain.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.chain.entities.Atividade;
import br.com.api.chain.repositories.AtividadeRepository;

@RestController
@RequestMapping("/activities")
public class AtividadeController {
    private final AtividadeRepository atividadeRepository;

    @Autowired
    public AtividadeController(AtividadeRepository atividadeRepository){
        this.atividadeRepository = atividadeRepository;
    }

    @GetMapping("/")
    public List<Atividade> getAtividades(){
        return atividadeRepository.findAll();
    }
}