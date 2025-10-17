package Conta_Bancaria;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class SuaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var ano_atual = OffsetDateTime.now().getYear();
        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu ano de nascimento: (yyyy)");
        int ano_nascimento = scanner.nextInt();
        int idade = (ano_atual - ano_nascimento);
        System.out.println("Olá, " + nome + " voce tem " + idade + " anos");
        scanner.close();

    }
}

