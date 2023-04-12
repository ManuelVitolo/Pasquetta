/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author studente
 */
public class Partecipante {
    private int Nome;
    private int Cognome;
    private float Totale;
    private Partecipante partecipante[];
    private int i=0;
    
    public Partecipante(int Nome, int Cognome, float Totale){
        setNome(Nome);
        setCognome(Cognome);
        setTotale (Totale);
       }

public void setNome(nome){
    this.nome=nome;
}

public void setCognome(cognome){
    this.cognome=cognome;
}

public void getNome(){
    return nome;
}

public void getCognome(){
    return cognome;
}

public Partecipante getPartecipante(int i){
    return [i];
}

public void setPartecipante(Partecipante partecipante){
    this.lista[i]=prodotto;
    i++;
}

}
