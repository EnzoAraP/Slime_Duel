/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slime_duel;

/**
 *
 * @author Nitro 5
 */
abstract class Slime {
    private Double Vida;
    private Double Multiplicador;
    private int Mana;
    private int Resistencia;
    private Double Energizado; 
    private int verificadorEnerg;
    public void atacar(Slime machucado)
    {
        if(Mana>=1)
        {
        Double redutor=Multiplicador -machucado.Resistencia +Energizado;
        if(redutor>=0)
        {
        machucado.Vida =machucado.Vida -(redutor);
        }
        if(Energizado>0)
        {
            Energizado=0.0;
        }
        Mana--;
        }
        else
                {
                    System.out.println("Não foi possivel atacar! Você não possui mana!");
                }
    }
    public void Energizar()
    {
        if(Mana>=2&&verificadorEnerg!=0){
        Energizado=0.5;
        verificadorEnerg=0;
        Mana = Mana-2;
        }
        else
                {
                    System.out.println("Não foi possivel Energizar!");
                }
    }
    public  abstract void Especial();
    
}
