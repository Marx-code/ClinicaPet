package model;

public abstract class Animal {
    private String nome;
    private int idade;
    private Proprietario dono;

    public Animal(String nome, int idade, Proprietario dono) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }


    public abstract void emitirSom();

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }

    public Proprietario getDono() { return dono; }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | Dono: " + dono;
    }
}