/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registreraLadok.app;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Swag
 */
@Entity
public class ladok implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    protected String idealUser;

    protected String kursKod;

    protected String termin;
    
    protected String provNr;

    protected String datum;

    protected String betyg;

    /**
     * Get the value of betyg
     *
     * @return the value of betyg
     */
    public String getBetyg() {
        return betyg;
    }

    /**
     * Set the value of betyg
     *
     * @param betyg new value of betyg
     */
    public void setBetyg(String betyg) {
        this.betyg = betyg;
    }

    /**
     * Get the value of datum
     *
     * @return the value of datum
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Set the value of datum
     *
     * @param datum new value of datum
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

        
    /**
     * Get the value of provNr
     *
     * @return the value of provNr
     */
    public String getProvNr() {
        return provNr;
    }

    /**
     * Set the value of provNr
     *
     * @param provNr new value of provNr
     */
    public void setProvNr(String provNr) {
        this.provNr = provNr;
    }


    /**
     * Get the value of termin
     *
     * @return the value of termin
     */
    public String getTermin() {
        return termin;
    }

    /**
     * Set the value of termin
     *
     * @param termin new value of termin
     */
    public void setTermin(String termin) {
        this.termin = termin;
    }

    /**
     * Get the value of kursKod
     *
     * @return the value of kursKod
     */
    public String getKursKod() {
        return kursKod;
    }

    /**
     * Set the value of kursKod
     *
     * @param kursKod new value of kursKod
     */
    public void setKursKod(String kursKod) {
        this.kursKod = kursKod;
    }

    /**
     * Get the value of idealUser
     *
     * @return the value of idealUser
     */
    public String getIdealUser() {
        return idealUser;
    }

    /**
     * Set the value of idealUser
     *
     * @param idealUser new value of idealUser
     */
    public void setIdealUser(String idealUser) {
        this.idealUser = idealUser;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ladok)) {
            return false;
        }
        ladok other = (ladok) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.registreraLadok.app.ladok[ id=" + id + " ]";
    }
    
}
