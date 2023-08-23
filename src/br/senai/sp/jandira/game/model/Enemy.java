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
}

