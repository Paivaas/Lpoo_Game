package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Battle {
        String scenarioBattle;
        Scanner teclado = new Scanner(System.in);
        Scenario scenario = new Scenario();

        Registrar registrar = new Registrar();
        public void ChoiceScenario(){
            System.out.println("--------------------------------");
            System.out.println("-----  Escolha um cenario  -----");

            System.out.println("[1 Italia] [2 Grecia] [3 Brasil] ");
            System.out.println("[4 Toquio] [5 Berlim] [6 Rio de janeiro]");
            System.out.println("--------------------------------");

            int userScenario = teclado.nextInt();
            scenario.Scenario(userScenario);

            String scenarioBattle = scenario.Scenario(userScenario);
            System.out.println("Cenario escolhido:" + scenarioBattle);

        }

        public void Battle(Player player, Enemy enemy){

            while(true) {

                int lifePlayer = player.Getlife();
                int lifeEnemy = enemy.GetLife();

                if(lifePlayer == 0){
                    System.out.println("O vencedor é o Enemy" + enemy.name);
                    break;
                }else if(lifeEnemy == 0){
                    System.out.println("O vencedor é o Player" + player.name);
                    break;
                }

                System.out.println("-----------  Battle  ----------");
                System.out.println("Ataque Player [ R ] - " + player.name + "life: " + lifePlayer);
                System.out.println("Ataque Enemy [ Q ] - " + player.name + "life: " + lifeEnemy);
                System.out.println("Defesa Player ou Enemy - ");
                String attack = teclado.next();

                if (attack.equalsIgnoreCase("R")) {

                    System.out.println("--------------------------------");
                    System.out.println("--------  Player Atacou --------");
                    System.out.println("--------------------------------");
                    int danoPlayer = (int) (Math.random() * 20) + 1;
                    int defesaEnemy = (int) (Math.random() * 20) + 1;
                    int danoReal;


                    System.out.println("O ataque foi de " + danoPlayer);

                    int chanceDeDefesa = (int) (Math.random()*5) + 1;

                    System.out.println("Digite o nome da defesa [1-5]");
                    int numberDefesa = teclado.nextInt();

                    if(numberDefesa == chanceDeDefesa){
                        danoReal = danoPlayer - defesaEnemy;
                    }else{
                        danoReal = danoPlayer;
                    }

                    if(danoReal < 0){
                        danoReal = 0;
                    }

                    enemy.SubtrairVida(danoReal);

                } else if (attack.equalsIgnoreCase("Q")) {

                    System.out.println("--------------------------------");
                    System.out.println("--------  Enemy Atacou  --------");
                    System.out.println("--------------------------------");

                    int danoEnemy = (int) (Math.random() * 20) + 1;
                    int defesaEnemy = (int) (Math.random() * 20) + 1;

                    int danoReal = danoEnemy - defesaEnemy;

                    enemy.SubtrairVida(danoEnemy);
                    System.out.println("O ataque foi de " + danoEnemy);

                    int chanceDeDefesa = (int) (Math.random()*5) + 1;

                    System.out.println("Digite o nome da defesa [1-5]");
                    int numberDefesa = teclado.nextInt();

                    if(numberDefesa == chanceDeDefesa){
                        danoReal = danoEnemy = defesaEnemy;
                    }else{
                        danoReal = danoEnemy;
                    }

                    if(danoReal < 0){
                        danoReal = 0;
                    }

                    player.SubtrairVida(danoEnemy);
                    System.out.println("O ataque foi de " + danoEnemy);

                } else {
                    System.out.println("Tecla invaliada");
                }
            }
        }
}



