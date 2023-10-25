package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gerente;
import br.senai.sp.jandira.model.Programador;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Petri", 7, 15000.0, 1000.0);
        Programador programador = new Programador("Gustavo", 12, 9000.0, 18);

        System.out.println("\nInformações do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Id: " + gerente.getId());
        System.out.println("Salário Base: R$" + gerente.getSalarioBase());
        System.out.println("Bônus de Gerência: " + gerente.getBonusGerencia());
        System.out.println("Salário Total: R$" + gerente.calcularSalario());

        System.out.println("\nInformações do Programador:");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("Id: " + programador.getId());
        System.out.println("Salário Base: R$" + programador.getSalarioBase());
        System.out.println("Horas Extras: " + programador.getHorasExtras());
        System.out.println("Salário Total: R$" + programador.calcularSalario());
    }
}


