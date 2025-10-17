package Exercicio_07;

import java.util.Locale;
import java.util.Scanner;

public class VerificaNumero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite um numero");
        var n1 = scanner.nextInt();
        System.out.println("Digite um numero maior que " + n1 + ":");
        var n2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Par ou impar?");
        String escolha = scanner.nextLine();
        var status = (escolha.equalsIgnoreCase("Par") ? 0 : 1);
        for (var i = n1; i <= n2; i++) {
            if (status == 0) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
