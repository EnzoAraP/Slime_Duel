/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slime_duel;

import java.util.Scanner;

/**
 *
 * @author Nitro 5
 */
public class Jogo {
  
   public void Inicio()
   {
       System.out.println("Bem-vindo ao Jogo dos Slimes!");
       System.out.println("Regras :");
       System.out.println("Cada slime possui 3 habilidades ativadas pelos seguintes comandos :");
       System.out.println("0:Terminar turno");
       System.out.println("1: Atacar");
       System.out.println("2: Energizar");
       System.out.println("3: Especial");
       System.out.println("Cada jogador pode escolher o seu Ancestral, os disponiveis são :");
       System.out.println("1- Vampiro");
        System.out.println("2- Dragão");
        System.out.println("3 - Sereia ");
        System.out.println("4- Anjo");
        System.out.println("5 - Demonio");
        
   }
   public Slime Escolha(int jogador)
   {
       Scanner teclado = new Scanner(System.in);
       int tipo=teclado.nextInt();
       int erro =-1;
       System.out.println("Jogador "+jogador+" escolha qual tipo de Ancestral voce quer ter!");
           while(erro !=0)
           {
               erro=0;
           try
           {
               Errotipo(tipo);
           }
           catch(ExceptionAncestral e)
           {
               System.out.println("Escreva um número entre 1 e 5!");
               teclado.nextLine();
               tipo=teclado.nextInt();
               erro++;
              
           }
           }
           switch(tipo)
           {
               case 1->
               {
                 SlimeVampiro jogador1 = new SlimeVampiro();
                 return jogador1;
               }
               case 2 ->
               {
                   SlimeDragao jogador1 = new SlimeDragao();
                   return jogador1;
               }
               case 3 ->
               {
                   SlimeSereia jogador1 = new SlimeSereia();
                   return jogador1;
               }
                 case 4 ->
               {
                   SlimeAnjo jogador1 = new SlimeAnjo();
                   return jogador1;
               }               
                 case 5->
                 {
                     SlimeDemonio jogador1= new SlimeDemonio();
                     return jogador1;
                 }
               
                 
               
                       
           
       
   }
       return null;
   }
   public void jogo()
   {
       Inicio();
       Slime Jogador1 =Escolha(1);
       Slime Jogador2  =Escolha(2);
   }
   public void Errotipo(int tipo) throws ExceptionAncestral
           {
               if(tipo>5||tipo<1)
               {
                   throw new ExceptionAncestral();
               }
           }
   
}
