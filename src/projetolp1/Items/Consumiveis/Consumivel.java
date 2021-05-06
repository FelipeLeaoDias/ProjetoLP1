/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp1.Items.Consumiveis;
import projetolp1.Items.Item;
import projetolp1.Principal.Personagem;
/**
 *
 * @author Batata
 */
public abstract class Consumivel extends Item {
    
  private int quantidade;
  
  public int getQuantidade(){
    return quantidade;
  }

  public int setQuantidade(int q){
    this.quantidade = q;
  }


  public int Consumir(int quant, Personagem p){
  quantidade =  quantidade - quant;
  efeito(p);
  return quantidade;
  }
  


  public abstract int efeito(Personagem p);
  
}
