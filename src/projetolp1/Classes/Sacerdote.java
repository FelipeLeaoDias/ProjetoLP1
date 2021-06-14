/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp1.Classes;

import projetolp1.Mapa.BlocoMapa;
import projetolp1.Mapa.Mapas;
import projetolp1.Misc.MultipDano;
import projetolp1.Principal.Personagem;

/**
 *
 * @author felip
 */
public class Sacerdote extends ClasseMae {

		@Override
    public boolean habDano(BlocoMapa b, Personagem self, Personagem target){
        int range = 3;
        int custo = 40;
        if(self.getMana() >= custo){
            if(b.getRangeEntreBlocos(target.getBlocoMapa()) <= range){
                self.setManaGasta(self.getManaGasta() + custo); // Diminui a mana do lançador de acordo com o valor da habilidade
                int elemento = 4; // Sagrado
                double formulaDano = 30 + self.getEquipamento().getAtk();
                formulaDano = MultipDano.getDanoPelaFormula(target, formulaDano, elemento, false);
                target.addDanoRecebido(formulaDano);
            }
            return true;
        }
        return false; 
    }
    
    @Override
    public boolean habDef(BlocoMapa b, Personagem self, Personagem target){
            int range = 3;
            int custo = 35;
            if(self.getMana() >= custo){
                    self.setManaGasta(self.getManaGasta() + custo); // Diminui a mana do lançador de acordo com o valor da habilidade
                    target.getStatus().cureStatus(3); // Congelar
                    target.getStatus().cureStatus(4); // Paralisar
                    target.getStatus().cureStatus(6); // Maldicao
                    if(target.getDanoRecebido() >= 15){
                            target.setDanoRecebido(-15);
                    }
            }
            return false;
    }
   
    @Override
    public boolean ultimate(BlocoMapa b, Personagem self, Personagem target){
        int range = 3;
        int custo = 50;
        if(self.getMana() >= custo){
            if(b.getRangeEntreBlocos(target.getBlocoMapa()) <= range){
                self.setManaGasta(self.getManaGasta() + custo); // Diminui a mana do lançador de acordo com o valor da habilidade
                // TODO: Implementar cura de 5 em area por 3 rodadas
                // TODO: Implementar dano de 10 sem def, em area e por turno. Pode usar Status...
                int elemento = 4;
                double formulaDano = 10 + self.getDano();
                formulaDano = MultipDano.getDanoPelaFormula(target, formulaDano, elemento, true);
                target.addDanoRecebido(formulaDano);
            }
            return true;
        }
        return false; 
    }
}
