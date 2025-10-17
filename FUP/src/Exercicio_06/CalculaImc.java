package Exercicio_06;

import java.util.Scanner;

public class CalculaImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura (M): ");
        var altura = scanner.nextDouble();
        System.out.println("Digite seu peso (KG): ");
        var peso = scanner.nextDouble();
        double imc = peso/(altura * altura);
        System.out.println("IMC: ");
        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc <= 24.9){
            System.out.println("Peso ideal");
        }else if(imc <= 29.9){
            System.out.printf("Levemente acima do peso");
        }else if(imc <= 34.9){
            System.out.println("Obesidade Grau 1");
        }else if(imc <= 39.9){
            System.out.println("Obesidade Grau 2");
        }else {
            System.out.println("Obesidade 3");
        }
        scanner.close();
    }
}
