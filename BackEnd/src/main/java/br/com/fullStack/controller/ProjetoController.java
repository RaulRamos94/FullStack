package br.com.fullStack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fullStack.model.Projeto;
import br.com.fullStack.repository.ProjetoRepository;

@RestController
@RequestMapping(name = "/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto cadastrarProjeto (@RequestBody Projeto projeto){
        return projetoRepository.save(projeto);
    }   
}
