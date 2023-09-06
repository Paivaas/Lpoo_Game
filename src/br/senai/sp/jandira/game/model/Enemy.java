package br.senai.sp.jandira.game.model;

public class Enemy {

    public String name;
    public String skin;
    public int life;

    public Enemy(){
        life = 100;
    }

    public int GetLife() {
        return life;
    }


    public void SubtrairVida(int danoEnemy){
        life -= danoEnemy;
        // ou  life = life - danoPlayer;]

        if(life < 0){
            life = 0;
        }
    }
}

