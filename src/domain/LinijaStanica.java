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
public class LinijaStanica implements Serializable {

    private Linija linija;
    private Stanica stanica;

    public LinijaStanica() {
    }

    public LinijaStanica(Linija linija, Stanica stanica) {
        this.linija = linija;
        this.stanica = stanica;
    }

    public Linija getLinija() {
        return linija;
    }

    public void setLinija(Linija linija) {
        this.linija = linija;
    }

    public Stanica getStanica() {
        return stanica;
    }

    public void setStanica(Stanica stanica) {
        this.stanica = stanica;
    }

}
