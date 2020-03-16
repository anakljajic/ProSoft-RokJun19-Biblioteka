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
public class LinijaMedjustanice implements Serializable {

    private String nazivLinije;
    private String pocetneStanica;
    private String krajnjaStanica;
    private String medjustanica;

    public LinijaMedjustanice() {
    }

    public LinijaMedjustanice(String nazivLinije, String pocetneStanica, String krajnjaStanica, String medjustanica) {
        this.nazivLinije = nazivLinije;
        this.pocetneStanica = pocetneStanica;
        this.krajnjaStanica = krajnjaStanica;
        this.medjustanica = medjustanica;
    }

    public String getNazivLinije() {
        return nazivLinije;
    }

    public void setNazivLinije(String nazivLinije) {
        this.nazivLinije = nazivLinije;
    }

    public String getPocetneStanica() {
        return pocetneStanica;
    }

    public void setPocetneStanica(String pocetneStanica) {
        this.pocetneStanica = pocetneStanica;
    }

    public String getKrajnjaStanica() {
        return krajnjaStanica;
    }

    public void setKrajnjaStanica(String krajnjaStanica) {
        this.krajnjaStanica = krajnjaStanica;
    }

    public String getMedjustanica() {
        return medjustanica;
    }

    public void setMedjustanica(String medjustanica) {
        this.medjustanica = medjustanica;
    }

    @Override
    public String toString() {
        return medjustanica;
    }

}
