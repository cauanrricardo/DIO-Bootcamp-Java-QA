package Desafio_02;

import java.util.Scanner;
/**
 * Gerencia a comparcao de senhas
 * @author cauanricardoribeiro
 * @version  1.0*/

public class ComparadorSenhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senhaDigitada = sc.nextLine();
        System.out.println("Confirme a senha: ");
        String senhaConfirmada = sc.nextLine();

        //.equals compara a string
        if(senhaConfirmada.equals(senhaDigitada)){
            System.out.println("Senha valida");
        } else{
            System.out.println("Senhas nao conferem");
        }

        sc.close();
    }
}
