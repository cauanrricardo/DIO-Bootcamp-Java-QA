package Exercicio_04;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome01, nome02;
        int idade01, idade02, dif;
        System.out.println("Digite o nome da primeira pessoa: ");
        nome01 = scanner.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        nome02 = scanner.nextLine();
        System.out.println("Digite a idade da primeira pessoa: ");
        idade01 = scanner.nextInt();
        System.out.println("Digite a idade da segunda pessoa: ");
        idade02 = scanner.nextInt();
        dif = Math.abs(idade01 - idade02);
        if (dif > 0){
            System.out.println(" A diferenca de idade eh de: " + dif + " anos");
        } else{
            System.out.println(" Nao tem diferenca de idade");
        }
        scanner.close();
    }
}
