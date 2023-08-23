package br.senai.sp.jandira.game.model;

public class Output {

    public void PrintPlayer(Player player){
        System.out.println("---------------------------------");
        System.out.println("O nome do Player é " + player.name);
        System.out.println("A skin é " + player.skin);
        System.out.println("A vida é" + player.Getlife());
    }

    public void PrintEnemy(Enemy enemy){
        System.out.println("-----------------------------");
        System.out.print("O nome do Enemy é " + enemy.name);
        System.out.print("A skin é " + enemy.skin);
        System.out.println("A vida é" + enemy.GetLife());
    }

}
