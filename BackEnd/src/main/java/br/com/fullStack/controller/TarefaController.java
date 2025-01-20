package br.com.fullStack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fullStack.model.Tarefa;
import br.com.fullStack.repository.TarefaRepository;

@RestController
@RequestMapping(name = "/tarefas")
public class TarefaController {

    @PostMapping
    public Tarefa cadastrarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @Autowired
    private TarefaRepository tarefaRepository;
    
}
