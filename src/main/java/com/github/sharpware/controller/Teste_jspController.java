package com.github.sharpware.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

@Controller
public class Teste_jspController {
    
    @Get("/teste")
    public void tudook(){
        System.out.print("Teste ok MSG Controller...");
    }
    
}
