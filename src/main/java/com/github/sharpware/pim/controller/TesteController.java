package com.github.sharpware.pim.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

@Controller
public class TesteController {
    
    @Get("/teste")
    public void teste(){
        System.out.print("Teste ok MSG Controller...");
    }
    
}
