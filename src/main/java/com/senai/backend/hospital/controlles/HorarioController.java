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

import com.senai.backend.hospital.models.Horario;
import com.senai.backend.hospital.services.HorarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/horario")
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @PostMapping("/cadastrar")
    public Horario cadastrar(@RequestBody Horario horario) {
        return horarioService.cadastrar(horario);
    }

    @GetMapping("/recuperar-por-id/{id}")
    public Horario recuperarPorId(@PathVariable Integer id) {
        return horarioService.recuperarPorId(id);
    }

    @GetMapping("/listar-todos")
    public List<Horario> listarTodos() {
        return horarioService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public Horario atualizar(@PathVariable Integer id, @RequestBody Horario horario) {
        return horarioService.atualizar(id,  horario);
    }

   @DeleteMapping("/remover/{id}")
   public boolean remover(@PathVariable Integer id) {
    return horarioService.removerPorId(id);
    }
}