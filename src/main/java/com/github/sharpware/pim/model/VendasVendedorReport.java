/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sharpware.pim.model;

import br.com.caelum.vraptor.jasperreports.Report;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author George
 */
public class VendasVendedorReport implements Report {

    private final List<Vendas> data;
    private final Map<String, Object> parameters;
    
    public VendasVendedorReport(List<Vendas> data){
        this.data= data;
        this.parameters = new HashMap<>();
    }
    
    @Override
    public String getTemplate() {
        return "RelatorioVendasVendedor.jasper";
    }

    @Override
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    @Override
    public Collection<Vendas> getData() {
        return data;
    }

    @Override
    public String getFileName() {
        return "WEB-INF/jasper/RelatorioVendasVendedor" + System.currentTimeMillis();
    }

    @Override
    public Report addParameter(String chave, Object valor) {
        this.parameters.put(chave, valor);
        return this;    
    }

    @Override
    public boolean isCacheable() {
        return true;
    }
}
