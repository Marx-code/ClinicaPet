# 🐾 Sistema de Gestão Veterinária (CRUD em Java)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

> Projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos, ministrada pelo Prof. Júnior Araujo.

## 📄 Sobre o Projeto

Este é um sistema de gerenciamento para clínicas veterinárias desenvolvido em **Java Puro**, rodando via console. O objetivo principal do projeto foi aplicar os **4 Pilares da Programação Orientada a Objetos** na construção de um **CRUD** (Create, Read, Update, Delete) funcional.

O sistema permite o cadastro de animais (Cachorros e Gatos) vinculados a seus proprietários, armazenando os dados em memória durante a execução.

---

## ⚙️ Funcionalidades

O sistema oferece um menu interativo no console com as seguintes opções:

- **[1] Cadastrar Animal:** Registra um novo pet (Cachorro ou Gato) e os dados do seu dono.
- **[2] Listar Animais:** Exibe todos os pacientes cadastrados e demonstra o polimorfismo (cada animal emite seu som específico).
- **[3] Atualizar Cadastro:** Permite editar o nome de um animal existente pelo ID.
- **[4] Remover Animal:** Exclui um registro do sistema (Alta médica).
- **[0] Sair:** Encerra a execução.

---

## 🏗️ Estrutura do Projeto (5 Classes)

O projeto foi arquitetado para atender ao requisito de exatamente **5 classes**, organizadas da seguinte forma:

1.  **`ClinicaPetMain.java`**: Classe principal. Contém o método `main`, o menu interativo e a lógica de controle do CRUD (Controller/View simplificados).
2.  **`Proprietario.java`**: Representa o dono do animal. Focada em **Encapsulamento** e **Composição**.
3.  **`Animal.java`**: Classe **Abstrata**. Serve de modelo genérico para os pets.
4.  **`Cachorro.java`**: Subclasse concreta que herda de Animal.
5.  **`Gato.java`**: Subclasse concreta que herda de Animal.

---

## 📚 Conceitos de POO Aplicados

Durante o desenvolvimento, foram aplicados os seguintes conceitos:

* 🔒 **Encapsulamento:** Uso de atributos `private` e métodos `getters/setters` para proteger os dados (Ex: classe `Proprietario`).
* users **Herança:** As classes `Cachorro` e `Gato` herdam atributos e métodos da superclasse `Animal`.
* 🎭 **Polimorfismo:** O método `emitirSom()` se comporta de maneira diferente dependendo se o objeto é um Cachorro ("Au Au") ou um Gato ("Miau Miau").
* 🧩 **Abstração:** A classe `Animal` é abstrata, impedindo a criação de um animal "genérico" sem espécie definida.

---

## 🚀 Como Executar

### Pré-requisitos
* Java JDK 8 ou superior instalado.
* Uma IDE Java (Recomendado: **IntelliJ IDEA**, Eclipse ou NetBeans).

### Passo a Passo
1.  Clone este repositório ou baixe os arquivos `.java`.
2.  Abra o projeto na sua IDE.
3.  Certifique-se de que os arquivos estão na estrutura de pacotes correta (se houver `package main;`, mantenha a pasta).
4.  Execute a classe **`ClinicaPetMain.java`**.
5.  Utilize o console da IDE para interagir com o menu.
