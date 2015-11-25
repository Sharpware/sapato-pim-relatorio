package com.github.sharpware.pim.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.jasperreports.Report;
import br.com.caelum.vraptor.jasperreports.download.ReportDownload;
import com.github.sharpware.pim.model.Vendas;
import com.github.sharpware.pim.model.VendasVendedorReport;
import java.util.List;
import javax.inject.Inject;


@Controller
public class RelatorioController {

    private final Vendas vendas;
    private final Result result;
    
    @Inject
    public RelatorioController(Vendas vendas, Result result) {
        this.vendas = vendas;
        this.result = result;
    }
    
    public void relatorioPDF() {
        Report report = generateReport();
        ReportDownload download = new ReportDownload(report, null);
    }
    
    private Report generateReport() {
        List<Vendas> data;
        //return new VendasVendedorReport(data);
    }
    
    /*
    @Get("/vendasvendedor")
    public void vendasPorVendedor() throws Exception {
        try {
            Map<String, Object> parametros = new HashMap<String, Object>();
            Connection connexao = new ConnectionFactory().getConnection();

            JasperPrint print = JasperFillManager.fillReport("RelatorioVendasVendedor."
                    + "jasper", parametros, connexao);

            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream(""
                    + "/jasper/RelatorioVendasVendedor.pdf"));
            exporter.exportReport();
            
            connexao.close();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        } 
    }

    @Get("/vendasperiodo/")
    public void vendasPorPeriodo() {
        try {

        } catch (Exception erro) {
            System.out.print("Erro ao executar relatório,"
                    + " log de erro: " + erro);
        } 
    }
    */
}
