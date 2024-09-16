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
        Energizado=0.0;
         verificadorEnerg=1;
         }

    /**
     *
     * @param inimigo
     */
    @Override
    public void Especial(Slime inimigo) {
        
        if(Mana>=4){
            if(inimigo.Dragao==0)
            {
        inimigo.Vida= inimigo.Vida-2;
        Vida++;
        Mana=Mana-4;
        }
            else
            {
                EspecialDragao((SlimeDragao)inimigo);
            }
        }
        else
        {
            System.out.println("Você não possui Mana para usar sua habilidade de Vampiro!");
        }
      
    }
    public void EspecialDragao(SlimeDragao inimigo)
    {
        if(inimigo.Itangivel==1)
        {
            System.out.println("O inimigo está intangivel! você não da dano nem se cura!");
              Mana=Mana-4;
        }
        else
        {
             inimigo.Vida= inimigo.Vida-2;
        Vida++;
        Mana=Mana-4;
        }
    }
    @Override
    public int Tipo()
    {
        return 1;
    }
    
}
