/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
    private BigDecimal rabat;
    private BigDecimal kolicina;
    private BigDecimal iznosStavke;

    @Override
    public String toString() {
        return "" + iznosStavke ;
    }

    public BigDecimal getIznosStavke() {
        BigDecimal iznosStavke = getKolicina().multiply(getProizvod().getCijena());
        BigDecimal sto = new BigDecimal(100);
        BigDecimal t = sto.subtract(getRabat());
        t=t.divide(sto);
        iznosStavke=iznosStavke.multiply(t);
        return iznosStavke;
    }

    public void setIznosStavke(BigDecimal iznosStavke) {
        this.iznosStavke = iznosStavke;
    }

    

    

    public Stavka() {
        super();
    }

    public Stavka(Usluga_proizvod proizvod, Racun racun, BigDecimal rabat, BigDecimal kolicina, Integer Id, Date vrijemeKreiranja, Date vrijemePromjene) {
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

    public BigDecimal getRabat() {
        return rabat;
    }

    public void setRabat(BigDecimal rabat) {
        this.rabat = rabat;
    }

    public BigDecimal getKolicina() {
        return kolicina;
    }

    public void setKolicina(BigDecimal kolicina) {
        this.kolicina = kolicina;
    }

}