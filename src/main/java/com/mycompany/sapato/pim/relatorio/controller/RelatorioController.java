package com.mycompany.sapato.pim.relatorio.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;

@Controller
public class RelatorioController {
    
    
    private String dataInicio;
    private String dataFinal;

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    @Get("/parametros/")
    public void chamarRelatorio(){
        try{
            if (true) {
                
            }
            else if (true) {
                
            }
        }
        catch(Exception erro){
            System.out.print("Erro ao executar relatório,"
                    + " log de erro: " + erro);
        }
        finally{
        }
        
    }
    
}
