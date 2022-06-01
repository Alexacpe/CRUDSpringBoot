package com.example.HolaSpring;

import com.example.HolaSpring.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//El controlador es quien envia información al navegador
//restcontroller es para que spring indentifique esta clase como controlador

@Controller

@Slf4j//para enviar mensajes al log
public class CotroladorInicio {

    //acceder al valor que se da desde application properties
    @Value("${index.saludo}") //se utiliza la misma llave valor que hay en application properties
    private String saludo;


    //especificar la ruta en la que se va a ejecutar el controlador
    @GetMapping("/")
    //compartir informacion con la vista
    public String inicio (Model model){
        var mensaje = " Mensaje con thymeleaf";

        //se crea a la variable de tipo persona con el constructor de la clase persona del dominio para compartirla con la vista
        var persona = new Persona();
        //se llaman los metodos set de cada atributo
        persona.setNombre("Alex");
        persona.setApellido("Acevedo");
        persona.setEmail("ejemplo@ejemplo.com");
        persona.setTelefono("1234567");

        //sergundo objeto de tipo persona
        var persona2 = new Persona();
        persona2.setNombre("Carla");
        persona2.setApellido("Suarez");
        persona2.setEmail("ejemplo2@ejemplo.com");
        persona2.setTelefono("246810");

        //lista de objetos de tipo persona
        var personas = Arrays.asList(persona, persona2);


        //mensaje que se ve en el log
        log.info("ejecutando el controlador Spring MVC");

        //se comarte la variable mensaje con la clase de modelo  con los atributos de llave valor
        model.addAttribute("mensaje",mensaje);

        //compartir la informacion tomada de applicatio properties
        model.addAttribute("saludo",saludo);

        //compartir el objeto persona con la vista
        model.addAttribute("persona", persona);

        //compartir lista de personas
        model.addAttribute("personas",personas);

        //devuelve un archivo html que se crea en resources
        return "index";
    };
}
