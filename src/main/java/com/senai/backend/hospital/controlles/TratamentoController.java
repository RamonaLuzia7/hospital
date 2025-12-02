package com.senai.backend.hospital.controlles;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.hospital.models.Tratamento;
import com.senai.backend.hospital.services.TratamentoService;

@RestController
@RequestMapping("/api/tratamentos")
public class TratamentoController {

    private final TratamentoService service;

    public TratamentoController(TratamentoService service) {
        this.service = service;
    }

    @PostMapping("/cadastrar")
    public Tratamento criar(@RequestBody Tratamento tratamento) {
        return service.cadastrar(tratamento); 
    }


    @GetMapping("/recuperar-por-id/{id}")
    public Tratamento recuperarPorId(@PathVariable Integer id) {
        return service.recuperarPorId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Integer id, @RequestBody Tratamento t) {
        try {
            return ResponseEntity.ok(service.atualizar(id, t));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}