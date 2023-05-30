package com.Electroiot.Electro.controller;


import com.Electroiot.Electro.model.entidades.Paciente;
import com.Electroiot.Electro.model.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/paciente-service")
public class UsuarioRestController {
    @Autowired
    
    private IPacienteService pacienteService;

    @RequestMapping(value = "/paciente/{id}", method = RequestMethod.GET)
    public Paciente getPaciente (@PathVariable long id ){
        Paciente paciente = new Paciente();
        paciente.setId(id);
        paciente.setEmail("cristhian0492@hotmail.com");
        paciente.setNombres("Cristhian David");
        paciente.setApellidos("Martinez");
        return paciente;
    }

    @RequestMapping(value = "/paciente", method = RequestMethod.POST)
    public void registrarPaciente(@RequestBody Paciente usuarioP){
        pacienteService.save(usuarioP);
    }
    public List<Paciente> getPacientes (){
        List<Paciente> pacientes = new ArrayList<Paciente>();
        for (int i=0; i<5; i++){
            pacientes.add(new Paciente());
        }
        return pacientes;
   }


}

