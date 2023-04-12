/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasquetta;

/**
 *
 * @author studente
 */
public class Prodotto {
    private int costo;
    private String nome;
    private int quantità;
    private Prodotto lista[];
    private int i=0;
    
    public Prodotto(int costo, String nome, int quantità){
        setCosto(costo);
        setNome(nome);
        setQuantità(quantità);
    }


   public void setCosto(int costo){
   this.costo=costo;
}

public void setNome(String nome){
this.nome=nome;
}

public void setQuantità(int quantità){
this.nome=nome;
}

public int getCosto(){
return costo;
}

public String getNome(){
return nome;
}

public int getQuantità(){
return quantità;
}

public Prodotto[] getLista(){
    return lista;
}

public void setLista(Prodotto[] lista){
    this.lista=lista;
}

public Prodotto getProdotto(int i){
    return lista[i];
 }

public void setProdotto(Prodotto prodotto, int i){
    this.lista[i]=prodotto;
}

public void aggiungiProdotto(Prodotto prodotto){
    this.lista[i]=prodotto;
    i++;
}

public void stampaProdotto(){
    System.out.println("Questi sono i prodotti che hai comprato");
    for(i=0;i<n;i++){
        System.out.println("Nome:"+lista[i].getNome()+"Prezzo"+lista[i].getPrezzo()+"Quantità"+lista[i].getQuantità());
    }
}

}