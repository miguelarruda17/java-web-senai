package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Funcionario funcionario = new Funcionario("Carlos", 3000);
     System.out.println("=== Funcionário ===");
     funcionario.exibirDados();

     System.out.println();// Linha em branco para separar a saida

     // Criando um gerente
     Gerente gerente1 = new Gerente("Ana", 5000);
     System.out.println("=== Gerente ===");
     gerente1.exibirDados();

        }

    }