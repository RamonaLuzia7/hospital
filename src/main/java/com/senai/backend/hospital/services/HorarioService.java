package com.senai.backend.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.hospital.models.Horario;
import com.senai.backend.hospital.repositories.HorarioRepository;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository horarioRepository;

    public Horario cadastrar(Horario horario) {
        return horarioRepository.save(horario);
    }

    public Horario recuperarPorId(Long id) {
        return horarioRepository.findById(id).orElse(null);
    }

    public List<Horario> listarTodos() {
        return horarioRepository.findAll();
    }

    public Horario atualizar(Long id, Horario horario) {
        Optional<Horario> horOpt = horarioRepository.findById(id);

        if (horOpt.isPresent()) {
            Horario h = horOpt.get();
            horario.setId(h.getId()); 
            return horarioRepository.save(horario);
        }
        return null;
    }

    public boolean remover(Long id) {
        Horario horario = horarioRepository.findById(id).orElse(null);

        if (h != null) {
            h.setStatus(false); 
            horarioRepository.save(h);
            return true;
        }
        return false;
    }
}