package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Battle {

    Scanner teclado = new Scanner(System.in);

    Scenario scenario = new Scenario();
    public void ChoiceScenario(){
        System.out.println("--------------------------------");
        System.out.println("-----  Escolha um cenario  -----");

        System.out.println("[1 Italia] [2 Grecia] [3 Brasil] ");
        System.out.println("[4 Rio de janeiro] [5 Toquio] [6 Berlim]");
        System.out.println("--------------------------------");


        int userScenario = teclado.nextInt();
        scenario.Scenario(userScenario);

        String scenarioBattle = scenario.Scenario(userScenario);
        System.out.println(scenarioBattle);

    }


    public void Battle(Player player, Enemy enemy){
        System.out.println(player.name);
        System.out.println(enemy.name);
    }
}
