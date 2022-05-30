package com.example.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        log.info("ejecutando el controlador Spring MVC");
        //se comarte la variable mensaje con la clase de modelo  con los atributos de llave valor
        model.addAttribute("mensaje",mensaje);
        //compartir la informacion tomada de applicatio properties
        model.addAttribute("saludo",saludo);
        //devuelve un archivo html que se crea en resources
        return "index";
    };
}
