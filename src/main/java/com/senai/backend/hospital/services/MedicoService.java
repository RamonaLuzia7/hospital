package com.senai.backend.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.hospital.models.Medico;
import com.senai.backend.hospital.repositories.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico cadastrar(Medico medico) {
        return medicoRepository.save(medico);
    }

    public Medico recuperarPorId(Integer id) {
        return medicoRepository.findById(id).orElse(null);
    }

    public List<Medico> listarTodos() {
        return medicoRepository.findAll();
    }

    public Medico atualizar(Integer id, Medico medico) {
        Optional<Medico> medOpt = medicoRepository.findById(id);
        if (medOpt.isPresent()) {
            Medico med = medOpt.get();
            medico.setId(med.getId());
            return medicoRepository.save(medico);
        }
        return null;
    }

    public boolean removerPorId(Integer id) {
        Medico med = medicoRepository.findById(id).orElse(null);
        if (med != null) {
            medicoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
