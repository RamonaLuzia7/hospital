package com.senai.backend.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.hospital.models.Paciente;
import com.senai.backend.hospital.repositories.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente cadastrar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public Paciente recuperarPorId(Integer id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();
    }

    public Paciente atualizar(Integer id, Paciente paciente) {
        Optional<Paciente> pacOpt = pacienteRepository.findById(id);

        if (pacOpt.isPresent()) {
            Paciente pac = pacOpt.get();
            paciente.setId(pac.getId());
            return pacienteRepository.save(paciente);
        }
        return null;
    }

    public boolean removerPorId(Integer id) {
        Paciente pac = pacienteRepository.findById(id).orElse(null);
        if (pac != null) {
            pacienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}