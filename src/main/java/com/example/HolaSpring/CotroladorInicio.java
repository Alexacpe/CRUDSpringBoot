package com.example.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//El controlador es quien envia información al navegador
//restcontroller es para que spring indentifique esta clase como controlador

@Controller

@Slf4j//para enviar mensajes al log
public class CotroladorInicio {
    //especificar la ruta en la que se va a ejecutar el controlador
    @GetMapping("/")
    public String inicio (){

        log.info("ejecutando el controlador Spring MVC");
        //devuelve un archivo html que se crea en resources
        return "index";
    };
}
