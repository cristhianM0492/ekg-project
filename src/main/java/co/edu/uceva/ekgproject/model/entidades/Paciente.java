package com.Electroiot.Electro.model.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_paciente")
    private Long id;

    @Getter @Setter @Column(name ="nombre")
    private String nombres;


    @Getter @Setter @Column(name ="apellido")
    private String apellidos;


    @Getter @Setter @Column(name ="email")
    private String email;


    private String telefono;

    @Getter @Setter @Column(name ="contrasenia")
    private String password;

    @Getter  @Setter
    private String Ciudad;

    private String Edad;
    private String Peso ;
    private String Estatura;
    private String Genero;
    private String AQuirurgicos;

    public String getNombre() {
        return nombres;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String peso) {
        Peso = peso;
    }

    public String getEstatura() {
        return Estatura;
    }

    public void setEstatura(String estatura) {
        Estatura = estatura;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getAQuirurgicos() {
        return AQuirurgicos;
    }

    public void setAQuirurgicos(String AQuirurgicos) {
        this.AQuirurgicos = AQuirurgicos;
    }

}
