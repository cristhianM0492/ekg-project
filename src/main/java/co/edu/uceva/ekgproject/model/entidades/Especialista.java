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
@Table(name="especialista")
public class Especialista {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter @Column(name ="nombre")
    private String nombre;

    @Getter @Setter @Column(name ="apellido")
    private String apellido;
    @Getter @Setter @Column(name ="email")
    private String email;

    private String telefono;
    @Getter @Setter @Column(name ="contrasenia")
    private String password;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPassword() {
        return password;
    }
}
