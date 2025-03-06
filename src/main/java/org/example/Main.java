package org.example;

<<<<<<< HEAD
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
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
       SpringApplication.run(Main.class, args);
    }
}
>>>>>>> 34518962b615ac572811e1a6bb53dc5434ac5a58
