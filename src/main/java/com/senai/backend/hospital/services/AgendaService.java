package com.senai.backend.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.hospital.models.Agenda;
import com.senai.backend.hospital.repositories.AgendaRepository;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public Agenda cadastrar(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    public Agenda recuperarPorId(Integer id) {
        return agendaRepository.findById(id).orElse(null);
    }

    public List<Agenda> listarTodos() {
        return agendaRepository.findAll();
    }

    public Agenda atualizar(Integer id, Agenda agenda) {
        Optional<Agenda> agOpt = agendaRepository.findById(id);
        if (agOpt.isPresent()) {
            Agenda ag = agOpt.get();
            agenda.setId(ag.getId());
            return agendaRepository.save(agenda);
        }
        return null;
    }

    public boolean removerPorId(Integer id) {
        Agenda ag = agendaRepository.findById(id).orElse(null);
        if (ag != null) {
            agendaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}