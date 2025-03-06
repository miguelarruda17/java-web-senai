package org.example;

public class Funcionario {

   String nome;
   double salarioBase;

   //Construtor
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    //Método que pode ser sobrescrito
    public double calcularSalario(){

    return salarioBase;

    }

    public void exibirDados(){

    System.out.println("Nome: " + nome);
    System.out.println("Salário: R$ " + calcularSalario());

    }



}
