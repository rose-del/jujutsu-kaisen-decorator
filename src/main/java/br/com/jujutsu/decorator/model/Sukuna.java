package main.java.br.com.jujutsu.decorator.model;

public class Sukuna implements Personagem {
    @Override
    public String getNome() {
        return "Ryomen Sukuna";
    }

    @Override
    public int getPoder() {
        return 110;
    }

    @Override
    public int getDefesa() {
        return 100;
    }

    @Override
    public String getHabilidades() {
        return "Energia Amaldiçoada";
    }
}
