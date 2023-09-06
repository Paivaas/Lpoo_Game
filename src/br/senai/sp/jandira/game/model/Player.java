package br.senai.sp.jandira.game.model;

public class Player {
    public String name;
    public String skin;

    public int life;

    public Player(){
        life = 100;
    }
    public int Getlife(){
        return life;
    }

    public void SubtrairVida(int danoPlayer){
        life -= danoPlayer;
        // ou  life = life - danoPlayer;]

        if(life < 0){
            life = 0;
        }
    }

    public void RegistrarLife(){
        life = 100;
    }



}
