package com.senai.backend.hospital.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.hospital.models.Agenda;
import com.senai.backend.hospital.services.AgendaService;



@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @PostMapping("/cadastrar")
    public Agenda cadastrar(@RequestBody Agenda agenda) {
        return agendaService.cadastrar(agenda);
    }

     @GetMapping("/recuperar-por-id/{id}")
    public Agenda recuperarPorId(@PathVariable Integer id) {
    return agendaService.recuperarPorId(id);
}

    @GetMapping("/listar-todos")
    public List<Agenda> listarTodos() {
    return agendaService.listarTodos();
}

    @PutMapping("/atualizar/{id}")
    public Agenda atualizar(@PathVariable Integer id, @RequestBody Agenda agenda) {
    return agendaService.atualizar(id, agenda);
    }

    @DeleteMapping("/remover/{id}")
    public boolean remover(@PathVariable Integer id) {
    return agendaService.removerPorId(id);
    }
}