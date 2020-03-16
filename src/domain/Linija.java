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
public class Linija implements Serializable {

    private Long linijaID;
    private String nazivLinije;
    private Long pocetnaStanica;
    private Long krajnjaStanica;

    public Linija() {
    }

    public Linija(Long linijaID, String nazivLinije, Long pocetnaStanica, Long krajnjaStanica) {
        this.linijaID = linijaID;
        this.nazivLinije = nazivLinije;
        this.pocetnaStanica = pocetnaStanica;
        this.krajnjaStanica = krajnjaStanica;
    }

    public Long getLinijaID() {
        return linijaID;
    }

    public void setLinijaID(Long linijaID) {
        this.linijaID = linijaID;
    }

    public String getNazivLinije() {
        return nazivLinije;
    }

    public void setNazivLinije(String nazivLinije) {
        this.nazivLinije = nazivLinije;
    }

    public Long getPocetnaStanica() {
        return pocetnaStanica;
    }

    public void setPocetnaStanica(Long pocetnaStanica) {
        this.pocetnaStanica = pocetnaStanica;
    }

    public Long getKrajnjaStanica() {
        return krajnjaStanica;
    }

    public void setKrajnjaStanica(Long krajnjaStanica) {
        this.krajnjaStanica = krajnjaStanica;
    }

    @Override
    public String toString() {
        return nazivLinije;
    }

}
