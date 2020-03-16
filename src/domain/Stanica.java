/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author anakl
 */
public class Stanica implements Serializable {

    private Long stanicaID;
    private String nazivStanice;

    public Stanica() {
    }

    public Stanica(Long stanicaID, String nazivStanice) {
        this.stanicaID = stanicaID;
        this.nazivStanice = nazivStanice;
    }

    public Long getStanicaID() {
        return stanicaID;
    }

    public void setStanicaID(Long stanicaID) {
        this.stanicaID = stanicaID;
    }

    public String getNazivStanice() {
        return nazivStanice;
    }

    public void setNazivStanice(String nazivStanice) {
        this.nazivStanice = nazivStanice;
    }

    @Override
    public String toString() {
        return nazivStanice;
    }

}
