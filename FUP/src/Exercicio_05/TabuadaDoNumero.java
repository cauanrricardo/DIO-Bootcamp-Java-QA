package Exercicio_05;

import java.util.Scanner;

public class TabuadaDoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        var numero = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
        scanner.close();
    }
}
