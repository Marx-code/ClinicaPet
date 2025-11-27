package model;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, Proprietario dono) {
        super(nome, idade, dono);
    }

    @Override
    public void emitirSom() {
        System.out.println("   -> O cachorro latiu: Au Au!");
    }
}