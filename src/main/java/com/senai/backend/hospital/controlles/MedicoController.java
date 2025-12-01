package com.senai.backend.hospital.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.hospital.models.Medico;
import com.senai.backend.hospital.services.MedicoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping("/cadastrar")
    public Medico cadastrar(@RequestBody Medico medico) {
        return medicoService.cadastrar(medico);
    }

    @GetMapping("/recuperar-por-id/{id}")
    public Medico recuperarPorId(@PathVariable Long id) {
        return medicoService.recuperarPorId(id);
    }

    @GetMapping("/listar-todos")
    public List<Medico> listarTodos() {
        return medicoService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public Medico atualizar(@PathVariable Long id, @RequestBody Medico medico) {
        return medicoService.atualizar(id, medico);
    }

    @DeleteMapping("/remover/{id}")
    public boolean remover(@PathVariable Long id) {
        return medicoService.desativar(id);
    }
}