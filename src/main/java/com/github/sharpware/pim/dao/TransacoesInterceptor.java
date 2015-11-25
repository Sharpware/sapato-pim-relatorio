package com.github.sharpware.pim.dao;

import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.interceptor.AcceptsWithAnnotations;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;

import javax.inject.Inject;

import com.github.sharpware.pim.annotation.Transacional;

@Intercepts
@AcceptsWithAnnotations(Transacional.class)
public class TransacoesInterceptor {

    private final ConnectionFactory factory;
    
    @Inject
    public TransacoesInterceptor(ConnectionFactory factory) {
        this.factory = factory;
    }

    public TransacoesInterceptor() {
        this(null);
    }
    
    @AroundCall
    public void trataTransacao(SimpleInterceptorStack stack) {
       /* try {
            transaction.begin();
            stack.next();
            transaction.commit();
        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
        }
               */
    }
}
