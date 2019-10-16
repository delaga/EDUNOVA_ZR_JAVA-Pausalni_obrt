/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author mirza
 */
@Entity
public class Stavka extends Entitet implements Serializable {

    @ManyToOne
    private Usluga_proizvod proizvod;
    @ManyToOne
    private Racun racun;
    private double rabat;
    private double kolicina;
    private double iznosStavke;

    @Override
    public String toString() {
        return "" + iznosStavke ;
    }

    public double getIznosStavke() {
        Double iznosStavke = getKolicina() * getProizvod().getCijena()*((100-getRabat())/100);
        return iznosStavke;
    }

    public void setIznosStavke(double iznosStavke) {
        this.iznosStavke = iznosStavke;
    }

    

    

    public Stavka() {
        super();
    }

    public Stavka(Usluga_proizvod proizvod, Racun racun, double rabat, double kolicina, Integer Id, Date vrijemeKreiranja, Date vrijemePromjene) {
        super(Id, vrijemeKreiranja, vrijemePromjene);
        this.proizvod = proizvod;
        this.racun = racun;
        this.rabat = rabat;
        this.kolicina = kolicina;
    }

    public Usluga_proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Usluga_proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public double getRabat() {
        return rabat;
    }

    public void setRabat(double rabat) {
        this.rabat = rabat;
    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

}