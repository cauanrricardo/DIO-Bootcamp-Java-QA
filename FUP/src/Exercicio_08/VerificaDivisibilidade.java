package Exercicio_08;

import java.util.Locale;
import java.util.Scanner;

public class VerificaDivisibilidade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o número inicial (divisor): ");
        int numeroInicial = scanner.nextInt();

        if (numeroInicial == 0) {
            System.out.println("O número inicial não pode ser 0. Programa encerrado.");
            scanner.close();
            return;
        }

        System.out.println("\nOk, o número base é " + numeroInicial + ".");
        System.out.println("Agora, informe outros números. O programa irá parar quando um número não for divisível por " + numeroInicial + ".");

        while (true) {
            System.out.print("Informe o próximo número: ");
            int numeroInformado = scanner.nextInt();

            if (numeroInformado < numeroInicial) {
                System.out.println(" -> Número '" + numeroInformado + "' é menor que o inicial (" + numeroInicial + "). Ignorando e pedindo o próximo...");
                continue;
            }

            if (numeroInformado % numeroInicial != 0) {
                int resto = numeroInformado % numeroInicial;
                System.out.println("\nCONDIÇÃO DE PARADA ATINGIDA!");
                System.out.println("O número " + numeroInformado + " dividido por " + numeroInicial + " tem resto " + resto + " (diferente de 0).");
                break;
            }


            System.out.println(" -> Número '" + numeroInformado + "' é divisível por " + numeroInicial + ". Continue informando...");
        }

        scanner.close();
    }
}
