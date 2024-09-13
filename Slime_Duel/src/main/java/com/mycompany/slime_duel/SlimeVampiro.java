/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slime_duel;



/**
 *
 * @author Nitro 5
 */
public class SlimeVampiro  extends Slime {
SlimeVampiro()
      {
        Vida=10.0;
        Mana = 5;
        Resistencia = 0.0;
        Multiplicador =1.0;
        Dragao=0;
         }

    /**
     *
     * @param inimigo
     */
    @Override
    public void Especial(Slime inimigo) {
        if(Mana>=4){
        inimigo.Vida= inimigo.Vida-2;
        Vida++;
        Mana=Mana-4;
        }
        else
        {
            System.out.println("Você não possui Mana para usar sua habilidade de Vampiro!");
        }
      
    }
    @Override
    public int Tipo()
    {
        return 1;
    }
    
}
