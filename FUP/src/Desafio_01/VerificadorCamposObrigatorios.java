package Exercicio_09;

import java.util.Scanner;

/**
 * Vai verificar se todos os campos obrigatorios estao preenchidos
 * com conteudo util.
 * @author cauanricardoribeiro
 * @version 1.0
 */

public class VerificadorCamposObrigatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------INICIO CADASTRO ------------- ");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite seu email: ");
        String email = sc.nextLine();

        // isBlank() verifica se a string está vazia OU contém APENAS espaços, tabulações ou quebras de linha.
        // Isso garante que o campo tenha conteúdo útil.
        if (nome.isBlank() || cpf.isBlank() || email.isBlank()) {
            System.out.println("ERRO: Cadastro incompleto. Todos os campos devem ser obrigatórios");
        } else {
            System.out.println("SUCESSO: Cadastro validado");
        }
        sc.close();

    }

}
