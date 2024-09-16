/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slime_duel;


/**
 *
 * @author Nitro 5
 */
public class SlimeSereia  extends Slime {
SlimeSereia()
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
        if(Mana>=6)
        {
            Mana=2;
            inimigo.Mana=0;
        }
        else
        {
            System.out.println("Você não tem mana o suficiente para usar sua habilidade de Sereia! Lembre-se que o minimo de mana necessaria é 6!");
        }
    }
    @Override
    public int Tipo()
    {
        return 3;
    }
    
}
