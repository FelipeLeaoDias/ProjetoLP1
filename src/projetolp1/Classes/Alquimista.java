/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolp1.Classes;

import projetolp1.Mapa.BlocoMapa;
import projetolp1.Mapa.Mapas;
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
	 * @param self   Proprio Personagem
	 * @param target Personagem alvo
	 * @return
	 */

	@Override
	public boolean habDano(BlocoMapa b, Personagem self, Personagem target) {
            int custo = 20;
            int range = 3;
            if (self.getMana() >= custo) {
                if (b.getRangeEntreBlocos(target.getBlocoMapa()) <= range) {
                    self.setManaGasta(self.getManaGasta() + custo); // Diminui a mana do lançador de acordo com o valor da habilidade
                    int elemento = 0; // Fogo
                    double formulaDano = 15 + self.getEquipamento().getAtk();
                    formulaDano = MultipDano.getDanoPelaFormula(target, formulaDano, elemento,
                                    false);
                    target.getStatus().addStatus(5, 3);
                    target.addDanoRecebido(formulaDano);
                    return true;
                }
            }
            return false;
	}

        @Override
	public boolean habDef(BlocoMapa b, Personagem self, Personagem target) {
            int custo = 30;
            if (self.getMana() >= custo) {
                self.setManaGasta(self.getManaGasta() + custo);
                self.getStatus().addStatus(7, 2);
            }
            return true;
	}

	@Override
	public boolean ultimate(BlocoMapa b, Personagem self, Personagem target) {
		int range = 4;
		int custo = 30;
		if (self.getMana() >= custo) {
			if (b.getRangeEntreBlocos(target.getBlocoMapa()) <= range) {
                            self.setManaGasta(self.getManaGasta() + custo); // Diminui a mana do lançador de acordo com o valor da habilidade
                            int elemento = 3; // Vento
                            double formulaDano = 40;
                            // Ataque ignora defesa
                            formulaDano = MultipDano.getDanoPelaFormula(target, formulaDano, elemento, true);
                            target.getStatus().addStatus(4, 1);
                            target.addDanoRecebido(formulaDano);
			}
			return true;
		}
		return false;
	}
}
