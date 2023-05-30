package co.edu.uceva.ekgproject.model;



import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPacienteDao extends CrudRepository<Paciente, Long> {
    List<Paciente> getPacientesBy();
    void deletePacienteBy(long Long );
    boolean verificarContraseña(Paciente paciente);
}

