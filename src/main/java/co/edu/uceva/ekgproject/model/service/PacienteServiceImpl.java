package com.Electroiot.Electro.model.service;

import com.Electroiot.Electro.model.dao.IPacienteDao;
import com.Electroiot.Electro.model.entidades.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class PacienteServiceImpl implements IPacienteService {

    @Autowired
    IPacienteDao pacienteDao;



    @Override
    public Paciente save(Paciente paciente) {return pacienteDao.save(paciente);}

  @Override
    public void delete(Paciente paciente){pacienteDao.delete(paciente);}
    @Override
    public Paciente update(Paciente paciente) {
        return pacienteDao.save(paciente);
    }

    @Override
    public List<Paciente> findAll() {
        return null;
    }


    @Transactional(readOnly = true)  //Para ejecutar en modo de solo lectura

    @Override
    public Paciente findById(Long id) {
        return pacienteDao.findById(id).get();
    }
}