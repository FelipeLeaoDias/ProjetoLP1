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
public abstract class Anao extends RacaBase {
  Anao(Personagem p){
    modAtributo(p, 0); // Vida
    modAtributo(p, 2); // Defesa
  }
}