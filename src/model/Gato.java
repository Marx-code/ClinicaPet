package model;

public class Gato extends Animal {

    public Gato(String nome, int idade, Proprietario dono) {
        super(nome, idade, dono);
    }

    @Override
    public void emitirSom() {
        System.out.println("   -> O gato miou: Miau Miau!");
    }
}