/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp1.Classes;
import projetolp1.Principal.Personagem;
import projetolp1.Misc.MultipDano;
/**
 *
 * @author felip
 */
public class Alquimista extends ClasseMae {
    Personagem self; // Link para o personagem dono da que possui a classe Alquimista
		
    // Lembrar de implementar formulas melhores pra as funcoes
    /**
     * @param self Proprio Personagem
     * @param target Personagem alvo
     * @return
     */
    
		@Override
    public boolean habDano(Personagem self, Personagem target){
			int custo = 20;
			int range = 3;
			if(self.getMana() >= custo){
        if(target.getPosicaoNoMapa() - self.getPosicaoNoMapa() <= range){
						self.setManaGasta(custo); // Diminui a mana do lançador de acordo com o valor da habilidade
						int elemento = 0; // Fogo
            double formulaDano = 15 + self.getEquipamento().getAtk();
						double mult = new MultipDano().resultado(elemento, target.getEquipamento().getDefElemental());
						formulaDano = formulaDano * mult;
						formulaDano -= target.getDefesa();
						// TODO: Implementar status de Burn
            target.addDanoRecebido(formulaDano);
						return true;
        }
			}
			return false;
		}
    
		public boolean habDef(Personagem self, Personagem target){
			int custo = 30;
			if(self.getMana() >= custo){
				target.getStatus().addStatus(7, 2);
                                self.setManaGasta(self.getManaGasta() + 30);
			}
			return true;
		}

   
    @Override
    public boolean ultimate(Personagem self, Personagem target){
			int range = 4;
			int custo = 30;
			if(self.getMana() >= custo){
					if(target.getPosicaoNoMapa() - self.getPosicaoNoMapa() <= range){
						self.setManaGasta(custo); // Diminui a mana do lançador de acordo com o valor da habilidade
						int elemento = 3; // Vento
            double formulaDano = 40;
						double mult = new MultipDano().resultado(elemento, target.getEquipamento().getDefElemental());
						formulaDano = formulaDano * mult;
						// Ataque ignora defesa
            target.addDanoRecebido(formulaDano);
						//TODO: Implementar paralisia de 1 turno
        }
				return true; 
			}
			return false;
		}
}
