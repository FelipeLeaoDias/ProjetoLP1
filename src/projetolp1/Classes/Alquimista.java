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
			int range = 1;
        if(target.getPosicaoNoMapa() - self.getPosicaoNoMapa() <= range){
						int elemento = 0;
            double formulaDano = 10 + self.getDano();
						double mult = new MultipDano().resultado(elemento, target.getEquipamento().getDefElemental());
						formulaDano = formulaDano * mult;
            target.setDanoRecebido(formulaDano);
        }
        return true;
    }
    
   
    @Override
    public boolean ultimate(Personagem self, Personagem target){
			int range = 1;
        if(target.getPosicaoNoMapa() - self.getPosicaoNoMapa() <= range){
						int elemento = 0;
            double formulaDano = 20 + self.getDano();
						double mult = new MultipDano().resultado(elemento, target.getEquipamento().getDefElemental());
						formulaDano = formulaDano * mult;
            target.setDanoRecebido(formulaDano);
        }
        return true;    
		}
}
