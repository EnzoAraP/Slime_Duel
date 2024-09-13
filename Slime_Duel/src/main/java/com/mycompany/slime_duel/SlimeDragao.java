/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slime_duel;


/**
 *
 * @author Nitro 5
 */
public class SlimeDragao  extends Slime {
     private int Itangivel;
    SlimeDragao()
      {
        Vida=10.0;
        Mana = 5;
        Resistencia = 0.0;
        Multiplicador =1.0;
        Itangivel=0;
        Dragao=1;
         }

    /**
     *
     * @param inimigo
     */
    @Override
    public void Especial(Slime inimigo) {
        if(Mana>=4)
        {
            Itangivel = 1;
            Multiplicador= Multiplicador+0.2;
            Mana=Mana-4;
        }
        else
        {
            System.out.println("Você não possui mana o suficiente para usar sua habilidade de Dragão!");
        }
    }
    public void SaiEspecial(){
        
        if (Itangivel ==1)
        {
            Itangivel = 0;
            Multiplicador= Multiplicador-0.2;
        }
        
    }
    @Override
    public int Tipo()
    {
        return 2;
    }
}
