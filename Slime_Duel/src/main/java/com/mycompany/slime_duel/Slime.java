/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slime_duel;

/**
 *
 * @author Nitro 5
 */
public abstract class Slime {
    protected Double Vida;
    protected Double Multiplicador;
    protected int Mana;
    protected Double Resistencia;
    protected Double Energizado;
    protected int Dragao;
    protected int verificadorEnerg;
    public void atacar(Slime machucado)
    {
        if(Mana>=1)
        {
            
        Double redutor=Multiplicador -machucado.Resistencia +Energizado;
        if(redutor>=0)
        {
        machucado.Vida =machucado.Vida -(redutor);
            System.out.println("Dano causado: "+redutor);
        }
        if(Energizado>0)
        {
            Energizado=0.0;
            verificadorEnerg=1;
        }
        Mana--;
}
        else
                {
                    System.out.println("Não foi possivel atacar! Você não possui mana!");
                }
    }
    public void atacarDragao(SlimeDragao machucado)
    {
        if(Mana>=1)
        {
            
        Double redutor=Multiplicador -machucado.Resistencia +Energizado;
        if(machucado.Itangivel==0)
        {
        if(redutor>=0)
        {
        machucado.Vida =machucado.Vida -(redutor);
            System.out.println("Dano causado: "+redutor);
        }
        if(Energizado>0)
        {
            Energizado=0.0;
            verificadorEnerg=1;
        }
        }
        else
        {
            System.out.println(" O Slime inimigo está intangivel! Você perdeu a mana porem não atacou!");
          
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
    public  abstract void Especial(Slime inimigo);
    public abstract int Tipo();
}
