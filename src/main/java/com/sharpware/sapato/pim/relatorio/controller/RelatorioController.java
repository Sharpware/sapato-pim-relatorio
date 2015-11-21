package com.sharpware.sapato.pim.relatorio.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import com.sharpware.sapato.pim.connectionFactory.ConnectionFactory;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

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
            Map<String, Object> parametros = new HashMap<String, Object>();
            Connection connexao = new ConnectionFactory().getConnection();

            JasperPrint print = JasperFillManager.fillReport("RelatorioVendasVendedor."
                    + "jasper", parametros, connexao);

            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream(""
                    + "RelatorioVendasVendedor.pdf"));
            exporter.exportReport();

            connexao.close();
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

        }
        catch(Exception erro){
            System.out.print("Erro ao executar relatório,"
                    + " log de erro: " + erro);
        }
        finally{
        }
        
    }
    
}
