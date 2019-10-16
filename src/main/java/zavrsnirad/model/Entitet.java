/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author mirza
 */
@MappedSuperclass
public abstract class Entitet {
    @Id
    @GeneratedValue
    private Integer Id;
    private Date vrijemeKreiranja;
    private Date vrijemePromjene;

    public Entitet() {
    }

    public Entitet(Integer Id, Date vrijemeKreiranja, Date vrijemePromjene) {
        this.Id = Id;
        this.vrijemeKreiranja = vrijemeKreiranja;
        this.vrijemePromjene = vrijemePromjene;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Date getVrijemeKreiranja() {
        return vrijemeKreiranja;
    }

    public void setVrijemeKreiranja(Date vrijemeKreiranja) {
        this.vrijemeKreiranja = vrijemeKreiranja;
    }

    public Date getVrijemePromjene() {
        return vrijemePromjene;
    }

    public void setVrijemePromjene(Date vrijemePromjene) {
        this.vrijemePromjene = vrijemePromjene;
    }

  
}
