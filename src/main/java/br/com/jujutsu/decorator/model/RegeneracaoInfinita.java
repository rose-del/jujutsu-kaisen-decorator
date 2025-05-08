package main.java.br.com.jujutsu.decorator.model;

public class RegeneracaoInfinita extends PoderDecorator {
    public RegeneracaoInfinita(Personagem personagem) {
        super(personagem);
    }

    @Override
    public int getDefesa() {
        return super.getDefesa() + 40;
    }

    @Override
    public String getHabilidades() {
        return super.getHabilidades() + ", Regeneração Infinita";
    }
}
