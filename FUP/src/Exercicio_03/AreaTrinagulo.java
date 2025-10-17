package Exercicio_03;

import java.util.Scanner;

public class AreaTrinagulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Digite a base do triangulo: ");
        base = scanner.nextDouble();
        System.out.println("Digite a altura do triangulo: ");
        altura = scanner.nextDouble();
        area = base * altura/2;
        System.out.println("Area do triangulo: " + area );
        scanner.close();


    }
}
