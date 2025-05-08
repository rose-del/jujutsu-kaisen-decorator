package main.java.br.com.jujutsu.decorator.model;

public class PoderDecorator implements Personagem{
    protected Personagem personagem;

    public PoderDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public String getNome() {
        return personagem.getNome();
    }

    @Override
    public int getPoder() {
        return personagem.getPoder();
    }

    @Override
    public int getDefesa() {
        return personagem.getDefesa();
    }

    @Override
    public String getHabilidades() {
        return personagem.getHabilidades();
    }
}
