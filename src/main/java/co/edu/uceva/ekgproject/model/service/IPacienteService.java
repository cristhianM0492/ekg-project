package com.Electroiot.Electro.model.service;

import com.Electroiot.Electro.model.entidades.Paciente;

import java.util.List;

public interface IPacienteService {
    Paciente save (Paciente paciente);

    void delete(Paciente paciente);
    Paciente update(Paciente paciente);
    List<Paciente> findAll();
    Paciente findById(Long id);
}


