/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.slime_duel;

import java.util.*;

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
       int tipo=0;
       int erro =-1;
       System.out.println("Jogador "+jogador+" escolha qual tipo de Ancestral voce quer ter!");
           while(erro !=0)
           {
               tipo=teclado.nextInt();
               erro=0;
           try
           {
               Errotipo(tipo);
           }
           catch(ExceptionAncestral | InputMismatchException e)
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
       int turno=1;
       Slime Jogador1 =Escolha(1);
       Slime Jogador2  =Escolha(2);
       
       int fim=-1;
       System.out.println("----------------------------------------------------");
       System.out.println("Inicio do Jogo!! ");
       System.out.println("----------------------------------------------------");
       while(fim!=0)
       {
           System.out.println("Inicio do turno "+turno+"!");
           System.out.println("Vida atual dos Slimes:");
           System.out.println("Jogador 1: "+Jogador1.Vida);
           System.out.println("Jogador 2: "+Jogador2.Vida);
           Jogadas(Jogador1,Jogador2,1);
             System.out.println("Vida atual dos Slimes:");
           System.out.println("Jogador 1: "+Jogador1.Vida);
           System.out.println("Jogador 2: "+Jogador2.Vida);
           Jogadas(Jogador2,Jogador1,2);
           turno++;
           
       }
   }
   public void Jogadas(Slime jogador,Slime inimigo,int indentificador)
   {
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("----------------------------------------------------");
       System.out.println("Turno o jogador "+indentificador+";");
        System.out.println("----------------------------------------------------");
        int fimrodada=-1;
        while(fimrodada!=0)
        {
       System.out.println("Digite a habilidade para o jogador "+indentificador+"usar: ");
       System.out.println("0: Termina o turno");
       System.out.println("1: Ataque");
       System.out.println("2: Energizar");
       String Poder= Podertipo(jogador);
       System.out.println("3: Especial: "+Poder);
       
       int habilidade=9 ;

       
       int erroHabilidade=-1;
       while(erroHabilidade!=0)
       {
           erroHabilidade=0;
       try
       {
           habilidade= teclado.nextInt();
           ErroHabilidade(habilidade);
       }
       catch(ExceptionHabilidade | InputMismatchException e)
       {
           teclado.nextLine();
           System.out.println("Escolha um valor entre 0 e 3!");
           erroHabilidade++;
       }
       }
       switch(habilidade){
           case 0->
           {
            fimrodada=0;
           }
            case 1->
           {
               if(inimigo.Dragao==0)
               {
                  jogador.atacar(inimigo);
               }
              else
               {
                   jogador.atacarDragao((SlimeDragao)inimigo);
               }
           }
            case 2->
           {
               jogador.Energizar();
           }
            case 3->
           {
               jogador.Especial(inimigo);
           }
       }
       if(jogador.Mana==0)
       {
           fimrodada=0;
           System.out.println("Sua mana acabou! Passando para o proximo jogador");
       }
        }
        
   }
  public String Podertipo(Slime jogador)
   {
         switch(jogador.Tipo())
           {
               case 1->
               {
                 
                 return "Causa 2 de dano e recupera 1 de vida";
               }
               case 2 ->
               {
                 
                   return "Ganha 0.2 de multiplicador de dano e invulnerabilidade por um turno";
               }
               case 3 ->
               {
                 
                   return "Fica com 2 de energia para zerar a energia do alvo (precisa de 6 de energia para usar)";
               }
                 case 4 ->
               {
                 
                   return "Ganha 0.2 de resistência pelo resto do jogo";
               }               
                 case 5->
                 {
                     
                     return "Ganha 0.2 de multiplicador de dano pelo resto do jogo";
                 }
   }
         return "";
   }
   public void Errotipo(int tipo) throws ExceptionAncestral
           {
               if(tipo>5||tipo<1)
               {
                   throw new ExceptionAncestral();
               }
           }
   public void ErroHabilidade(int habilidade)throws ExceptionHabilidade
   {
       if(habilidade<0||habilidade>3)
       {
           throw new ExceptionHabilidade();
       }
   }
}
