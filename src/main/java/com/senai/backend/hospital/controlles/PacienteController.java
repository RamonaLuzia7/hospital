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

import com.senai.backend.hospital.models.Paciente;
import com.senai.backend.hospital.services.PacienteService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/cadastrar")
    public Paciente cadastrar(@RequestBody Paciente paciente) {
        return pacienteService.cadastrar(paciente);
    }

    @GetMapping("/recuperar-por-id/{id}")
    public Paciente recuperarPorId(@PathVariable Long id) {
        return pacienteService.recuperarPorId(id);
    }

    @GetMapping("/listar-todos")
    public List<Paciente> listarTodos() {
        return pacienteService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public Paciente atualizar(@PathVariable Long id, @RequestBody Paciente paciente) {
        return pacienteService.atualizar(id, paciente);
    }

    @DeleteMapping("/remover/{id}")
    public boolean remover(@PathVariable Long id) {
        return pacienteService.desativar(id);
    }
}