/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp1.Racas;
import projetolp1.Principal.Personagem;

/**
 *
 * @author felip
 */

public abstract class RacaBase { 
    
  public abstract int HabUtility(Personagem alvo);

  public void modAtributo(Personagem p, int atr){
    switch(atr){
      case 0: //atributo modificador de vida maxima da raca
        p.setVidaMaxima(p.getVidaMaxima() + 20);
        break;
      case 1://atributo modificador de mana maxima da raca
        p.setManaMaxima(p.getManaMaxima() + 10);
        break;
      case 2://atributo modificador de defesa da raca
        p.setDefesa(p.getDefesa() + 5);
        break;
      case 3://atributo modificador de dano da raca
        p.setDanoBase(p.getDanoBase() + 5);
        break;
    }
  }
}

