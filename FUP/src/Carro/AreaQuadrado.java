package Carro;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado, area;
        System.out.println("Digite o lado do quadrado em metros: ");
        lado = scanner.nextDouble();
        area = lado * lado;
        System.out.println("Area do quadrado eh de: " + area + " M");
        scanner.close();
    }
}
