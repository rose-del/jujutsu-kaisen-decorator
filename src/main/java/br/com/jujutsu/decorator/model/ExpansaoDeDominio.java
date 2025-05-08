package main.java.br.com.jujutsu.decorator.model;

public class ExpansaoDeDominio extends PoderDecorator {
    public ExpansaoDeDominio(Personagem personagem) {
        super(personagem);
    }

    @Override
    public int getPoder() {
        return super.getPoder() + 50;
    }

    @Override
    public String getHabilidades() {
        return super.getHabilidades() + ", Expansão de Domínio";
    }
}
