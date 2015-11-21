package com.sharpware.sapato.pim.relatorio.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import java.sql.SQLException;

@Controller
public class RelatorioController{
    
    
    private String dataInicio;
    private String dataFinal;
    private String NomeVendedor;

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

    public String getNomeVendedor() {
        return NomeVendedor;
    }

    public void setNomeVendedor(String NomeVendedor) {
        this.NomeVendedor = NomeVendedor;
    }

    @Get("/VendasPorVendedor/")
    public void VendasPorVendedor(){
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
    
        @Get("/VendasPorPeriodo/")
    public void VendasPorPeriodo(){
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
