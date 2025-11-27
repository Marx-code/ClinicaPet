package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Animal;
import model.Cachorro;
import model.Gato;
import model.Proprietario;

public class ClinicaPetMain {

    private static List<Animal> listaAnimais = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n=== CLÍNICA VETERINÁRIA ===");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Animais");
            System.out.println("3 - Atualizar (Nome do Animal)");
            System.out.println("4 - Remover Animal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                opcao = -1;
            }

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> atualizar();
                case 4 -> remover();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Digite um número.");
            }
        } while (opcao != 0);
    }


    private static void cadastrar() {
        System.out.println("\n--- NOVO CADASTRO ---");
        System.out.print("Nome do Dono: ");
        String nomeDono = scanner.nextLine();
        System.out.print("Telefone: ");
        String telDono = scanner.nextLine();

        Proprietario dono = new Proprietario(nomeDono, telDono);

        System.out.print("Nome do Animal: ");
        String nomePet = scanner.nextLine();

        System.out.print("Idade (apenas números): ");
        int idade = scanner.nextInt();

        System.out.print("É Cachorro (1) ou Gato (2)? ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        Animal animal;
        if (tipo == 1) {
            animal = new Cachorro(nomePet, idade, dono);
        } else {
            animal = new Gato(nomePet, idade, dono);
        }

        listaAnimais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    private static void listar() {
        System.out.println("\n--- PACIENTES CADASTRADOS ---");
        if (listaAnimais.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        for (int i = 0; i < listaAnimais.size(); i++) {
            Animal a = listaAnimais.get(i);
            System.out.println("ID [" + i + "] " + a.toString());
            a.emitirSom();
        }
    }

    private static void atualizar() {
        listar();
        if (listaAnimais.isEmpty()) return;

        System.out.print("Digite o ID do animal para editar o nome: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (id >= 0 && id < listaAnimais.size()) {
            System.out.print("Novo nome: ");
            String novoNome = scanner.nextLine();

            listaAnimais.get(id).setNome(novoNome);
            System.out.println("Nome atualizado!");
        } else {
            System.out.println("ID inválido.");
        }
    }

    private static void remover() {
        listar();
        if (listaAnimais.isEmpty()) return;

        System.out.print("Digite o ID do animal para dar alta (remover): ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (id >= 0 && id < listaAnimais.size()) {
            Animal removido = listaAnimais.remove(id);
            System.out.println(removido.getNome() + " foi removido do sistema.");
        } else {
            System.out.println("ID inválido.");
        }
    }
}