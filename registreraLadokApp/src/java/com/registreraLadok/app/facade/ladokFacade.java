/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registreraLadok.app.facade;

import com.registreraLadok.app.ladok;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Swag
 */
@Stateless
public class ladokFacade extends AbstractFacade<ladok> {

    @PersistenceContext(unitName = "registreraLadokAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ladokFacade() {
        super(ladok.class);
    }
    
}
