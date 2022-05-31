package com.example.HolaSpring.domain;

import lombok.Data;

@Data //gracias a Data no tenemos que crear todos los get, set y demas manualmente
public class Persona {
    //atributos de la clase
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
