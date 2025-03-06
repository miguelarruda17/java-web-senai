package org.example;

public class Gerente extends Funcionario {

 // Construtor
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Sobrescrevendo o método calcularSalario para adicionar um
    // bônus de 20%
    @Override
    public double calcularSalario(){
      return salarioBase * 1.2; // 20% a mais

    }

}
