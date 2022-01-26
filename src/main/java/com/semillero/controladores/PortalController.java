package com.semillero.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //1°anotación indicamos que es un componente de Sprimg que es un controalador (=va a responder a las peticiones HTTP q se generan en un navegador)
public class PortalController {
	
	@GetMapping("/") //c/v q alguien ingrese a la raiz (= "/")de ese servidor les da la bienvenida
	public String bienvenida() {
		return "index.html";
	}
}
