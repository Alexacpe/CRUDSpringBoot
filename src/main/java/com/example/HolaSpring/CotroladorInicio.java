package com.example.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//El controlador es quien envia información al navegador
//restcontroller es para que spring indentifique esta clase como controlador
@RestController
@Slf4j//para enviar mensajes al log
public class CotroladorInicio {
    //especificar la ruta en la que se va a ejecutar el controlador
    @GetMapping("/")
    public String inicio (){

        log.info("ejecutando el controlador rest");
        return "Hola mundo con Spring 2";
    };
}
