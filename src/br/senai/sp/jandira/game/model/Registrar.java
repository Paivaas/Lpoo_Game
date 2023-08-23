package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Registrar {

        int avaliaAmbos = 0;

        // instancia player
        Player player = new Player();
        // instancia enemy
        Enemy enemy = new Enemy();
        // instacia teclado
        Scanner teclado = new Scanner(System.in);
        // coleta de dados

        //output
        Output output = new Output();

        public void cadastrarPlayer() {
            System.out.println("---------------------------------------");
            System.out.println("------------Cadastro PLAYER------------");
            System.out.print("Digite seu seu nome: ");
            player.name = teclado.nextLine();
            System.out.println("Escolha sua skin [Red - Blue - Green]");
            player.skin = teclado.nextLine();
            System.out.println("-----------Cadastro concluido----------");
            System.out.println("---------------------------------------");

            if(avaliaAmbos!=1){
                output.PrintPlayer(player);
            }
        }
        public void cadastrarInimigo() {
            System.out.println("---------------------------------------");
            System.out.println("------------Cadastro ENEMY-------------");
            System.out.print("Digite seu seu nome: ");
            player.name = teclado.nextLine();
            System.out.println("Escolha sua skin [Red - Blue - Green]");
            player.skin = teclado.nextLine();
            System.out.println("-----------Cadastro concluido----------");
            System.out.println("---------------------------------------");

            if(avaliaAmbos!=1){
                output.PrintEnemy(enemy);
            }
        }
        public void cadastrosAmbos() {

            avaliaAmbos = 1;


            output.PrintPlayer(player);
            output.PrintEnemy(enemy);

            cadastrarInimigo();
            cadastrarPlayer();
        }
        public Player decision(){

            String decision;

            System.out.println("Bem vindo!");
            System.out.println("O que deseja cadastrar: [Player - Enemy - Ambos]");
            decision = teclado.nextLine();
            switch (decision){
                case "Player":
                cadastrarPlayer();
                break;

                case "Enemy":
                cadastrarInimigo();
                break;

                case "Ambos":
                cadastrosAmbos();
                break;

//                default: System.out.println("Escolha uma opção valida. O programa será ser reiniciado [ ↻ ]");
//                         System.out.println("");
//                decision();
            }

            System.out.println("Deseja cadastrar novamente? [s/n]");
            String cadastro = teclado.next();

            if(cadastro != "n"){
                decision();
            }
            return player;
        }
    }