package com.senai.backend.hospital.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.hospital.models.Tratamento;
import com.senai.backend.hospital.repositories.TratamentoRepository;

@Service
public class TratamentoService {

    @Autowired
    private TratamentoRepository tratamentoRepository;

  
    public Tratamento cadastrar(Tratamento tratamento) {
        return tratamentoRepository.save(tratamento);
    }

   
    public Tratamento recuperarPorId(Integer id) {
        return tratamentoRepository.findById(id).orElse(null);
    }

 
    public List<Tratamento> listarTodos() {
        return tratamentoRepository.findAll();
    }

    public Tratamento atualizar(Integer id, Tratamento tratamento) {
        Optional<Tratamento> trOpt = tratamentoRepository.findById(id);

        if (trOpt.isPresent()) {
            Tratamento tr = trOpt.get();
            tratamento.setId(tr.getId()); 
            return tratamentoRepository.save(tratamento);
        }
        return null;
    }

  
    public boolean removerPorId(Integer id) {
        Tratamento tr = tratamentoRepository.findById(id).orElse(null);
        if (tr != null) {
            tratamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}