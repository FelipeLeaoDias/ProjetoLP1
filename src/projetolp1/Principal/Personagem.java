/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp1.Principal;

import projetolp1.Classes.ClasseMae;
import projetolp1.Racas.RacaBase;

/**
 *
 * @author Batata
 */
public class Personagem {
    private String nome;
    private int vidaMaxima;
    private int danoRecebido; 
    private int manaGasta;
    private int manaMaxima;
    private int danoBase;
    private int Defesa;
    //private int status; // Transformar em classe
    private int qtdMovimento;
    private int posicaoNoMapa;
    private float modDano;
    private int status;
    // Equip equipamento -- talvez separar em slots? cabeca, armadura, botas.
    //ArrayList<item> Inventario = new ArrayList;
    // Dano dano;
    RacaBase  raca;
    ClasseMae classe;
    
    Personagem(String nome, ClasseMae classe, RacaBase raca){
      this.nome = nome;
      this.classe = classe;
      this.raca = raca;
      this.modDano = 1;

      this.danoBase = 20;
      this.Defesa = 5;
      this.manaMaxima = 50;
      this.vidaMaxima = 100;
      this.danoRecebido = 0;
      // this.status = 0;

    }
    
    
    public RacaBase getRaca(){
        return raca;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the vidaMaxima
     */
    public int getVidaMaxima() {
        return vidaMaxima;
    }

    /**
     * @param vidaMaxima the vidaMaxima to set
     */
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    /**
     * @return the danoRecebido
     */
    public int getDanoRecebido() {
        return danoRecebido;
    }

    /**
     * @param danoRecebido the danoRecebido to set
     */
    public void setDanoRecebido(int danoRecebido) {
        this.danoRecebido = danoRecebido;
    }

    /**
     * @return the manaAtual
     */
    public int getManaGasta() {
        return manaGasta;
    }

    /**
     * @param manaAtual the manaAtual to set
     */
    public void setManaGasta(int manaGasta) {
        this.manaGasta = manaGasta;
    }

    /**
     * @return the manaMaxima
     */
    public int getManaMaxima() {
        return manaMaxima;
    }

    /**
     * @param manaMaxima the manaMaxima to set
     */
    public void setManaMaxima(int manaMaxima) {
        this.manaMaxima = manaMaxima;
    }

    /**
     * @return the defesa
     */
    public int getDefesa() {
        return Defesa;
    }

    /**
     * @param defesa the defesa to set
     */
    public void setDefesa(int defesa) {
        this.Defesa = defesa;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the qtdMovimento
     */
    public int getQtdMovimento() {
        return qtdMovimento;
    }

    /**
     * @param qtdMovimento the qtdMovimento to set
     */
    public void setQtdMovimento(int qtdMovimento) {
        this.qtdMovimento = qtdMovimento;
    }

    /**
     * @return the posicaoNoMapa
     */
    public int getPosicaoNoMapa() {
        return posicaoNoMapa;
    }

    /**
     * @param posicaoNoMapa the posicaoNoMapa to set
     */
    public void setPosicaoNoMapa(int posicaoNoMapa) {
        this.posicaoNoMapa = posicaoNoMapa;
    }
   
  public float getDanoBase(){
    return this.modDano;
  }
  public void setDanoBase(float modDano){
    this.modDano = modDano;
  }
}
