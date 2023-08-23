package br.senai.sp.jandira.game.model;

import java.util.Scanner;



public class Menu {

    Scanner teclado = new Scanner(System.in);
    Battle battle = new Battle();

    boolean continuar = true;


    boolean continuar2 = true;
    /*Instanciar o scanner*/
    Scanner taclado = new Scanner(System.in);

    /*Instanciar o metodo*/
    Registrar registrar = new Registrar();



    public void Menu(){

        while (continuar){
        System.out.println("--------------------------------");
        System.out.println("----------  BEM VINDO  ---------");
        System.out.println("Escolha uma opção: ");
        System.out.println("[1 Register] [2 Battle] [3 Exit]");
        System.out.println("--------------------------------");

        int userOption  = teclado.nextInt();

        switch (userOption){
            case 1:
                registrar.decision();
                break;

            case 2:
                battle.ChoiceScenario();
                    battle.Battle();

                System.out.println("Feature in Development");
                break;

            case 3:
                continuar = false;
                break;

            }
        }
    }

}
