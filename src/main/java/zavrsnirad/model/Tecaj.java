/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.model;

/**
 *
 * @author Admin
 */
public class Tecaj {
 private String broj_tecajnice;
 private String datum_primjene;
 private String drzava;
 private String drzava_iso;
 private String sifra_valute;
 private String valuta;
 private int jedinica;
 private String kupovni_tecaj;
 private String srednji_tecaj;
 private String prodajni_tecaj;


 // Getter Methods 

 public String getBroj_tecajnice() {
  return broj_tecajnice;
 }

 public String getDatum_primjene() {
  return datum_primjene;
 }

 public String getDrzava() {
  return drzava;
 }

 public String getDrzava_iso() {
  return drzava_iso;
 }

 public String getSifra_valute() {
  return sifra_valute;
 }

 public String getValuta() {
  return valuta;
 }

 public int getJedinica() {
  return jedinica;
 }

 public String getKupovni_tecaj() {
  return kupovni_tecaj;
 }

 public String getSrednji_tecaj() {
  return srednji_tecaj;
 }

 public String getProdajni_tecaj() {
  return prodajni_tecaj;
 }

 // Setter Methods 

 public void setBroj_tecajnice(String broj_tecajnice) {
  this.broj_tecajnice = broj_tecajnice;
 }

 public void setDatum_primjene(String datum_primjene) {
  this.datum_primjene = datum_primjene;
 }

 public void setDrzava(String drzava) {
  this.drzava = drzava;
 }

 public void setDrzava_iso(String drzava_iso) {
  this.drzava_iso = drzava_iso;
 }

 public void setSifra_valute(String sifra_valute) {
  this.sifra_valute = sifra_valute;
 }

 public void setValuta(String valuta) {
  this.valuta = valuta;
 }

 public void setJedinica(int jedinica) {
  this.jedinica = jedinica;
 }

 public void setKupovni_tecaj(String kupovni_tecaj) {
  this.kupovni_tecaj = kupovni_tecaj;
 }

 public void setSrednji_tecaj(String srednji_tecaj) {
  this.srednji_tecaj = srednji_tecaj;
 }

 public void setProdajni_tecaj(String prodajni_tecaj) {
  this.prodajni_tecaj = prodajni_tecaj;
 }
}