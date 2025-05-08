package main.java.br.com.jujutsu.decorator.model;

public class Gojo implements Personagem {

    @Override
    public String getNome() {
        return "Satoru Gojo";
    }

    @Override
    public int getPoder() {
        return 100;
    }

    @Override
    public int getDefesa() {
        return 100;
    }

    @Override
    public String getHabilidades() {
        return "Técnica do Infinito";
    }
}
