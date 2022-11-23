package com.example;

public class Persona {
   private String nome;
   private String cognome;
   private String nazioneDiResidenza;

    public Persona(){
    };

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setNazioneDiResidenza(String nazioneDiResidenza) {
        this.nazioneDiResidenza = nazioneDiResidenza;
    }
    public String getNazioneDiResidenza() {
        return nazioneDiResidenza;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
}
