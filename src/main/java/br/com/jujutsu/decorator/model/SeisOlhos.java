package main.java.br.com.jujutsu.decorator.model;

public class SeisOlhos extends PoderDecorator {
    public SeisOlhos(Personagem personagem) {
        super(personagem);
    }

    @Override
    public int getPoder() {
        return super.getPoder() + 30;
    }

    @Override
    public String getHabilidades() {
        return super.getHabilidades() + ", Seis Olhos";
    }
}

