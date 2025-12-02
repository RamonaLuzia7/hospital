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

    public Horario recuperarPorId(Integer id) {
        return horarioRepository.findById(id).orElse(null);
    }

    public List<Horario> listarTodos() {
        return horarioRepository.findAll();
    }

    public Horario atualizar(Integer id, Horario horario) {
    Optional<Horario> horOpt = horarioRepository.findById(id);
    if (horOpt.isPresent()) {
        Horario hor = horOpt.get();
        horario.setId(hor.getId());
        return horarioRepository.save(horario);
    }
    return null;
}

    public boolean removerPorId(Integer id) {
        Horario hor = horarioRepository.findById(id).orElse(null);
        if (hor != null) {
            horarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
