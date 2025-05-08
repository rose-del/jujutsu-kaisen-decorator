package main.java.br.com.jujutsu.decorator.controller;

import main.java.br.com.jujutsu.decorator.model.*;

public class Batalha {
    public static void main(String[] args) {
        Personagem gojo = new Gojo();
        gojo = new SeisOlhos(gojo);
        gojo = new ExpansaoDeDominio(gojo);
        gojo = new RegeneracaoInfinita(gojo);

        Personagem sukuna = new Sukuna();
        sukuna = new ExpansaoDeDominio(sukuna);
        sukuna = new RegeneracaoInfinita(sukuna);


        System.out.println("👊 " + gojo.getNome());
        System.out.println("Poder: " + gojo.getPoder());
        System.out.println("Defesa: " + gojo.getDefesa());
        System.out.println("Habilidades: " + gojo.getHabilidades());

        System.out.println("\n💀 " + sukuna.getNome());
        System.out.println("Poder: " + sukuna.getPoder());
        System.out.println("Defesa: " + sukuna.getDefesa());
        System.out.println("Habilidades: " + sukuna.getHabilidades());
    }
}

