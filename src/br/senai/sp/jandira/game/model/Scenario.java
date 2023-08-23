package br.senai.sp.jandira.game.model;

public class Scenario {

    public String Scenario (int scenarioOption){

        String scenario = "Senai Jandira";

        switch (scenarioOption){

            case 1:
                scenario = "italia";
                break;
            case 2:
                scenario = "Grecia";
                break;
            case 3:
                scenario = "Brasil";
                break;
            case 4:
                scenario = "Rio de janeiro";
                break;
            case 5:
                scenario = "Toquio";
                break;
            case 6:
                scenario = "Maldivas";
                break;
        }
        return scenario;
    }
}
