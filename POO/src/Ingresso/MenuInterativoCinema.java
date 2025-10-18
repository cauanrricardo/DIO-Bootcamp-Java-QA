package Ingresso;

import java.util.Scanner;

/**
 * Classe principal responsável por exibir um menu interativo de compra de ingressos.
 * O usuário pode escolher o tipo de ingresso (comum, meia entrada ou família)
 * e visualizar o valor total de acordo com as regras de cada tipo.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class MenuInterativoCinema {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- BEM-VINDO AO SISTEMA DE INGRESSOS CLUB DA LULU CINEMAS ---");

        int opcao = -1;
        while (opcao != 0) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                processarOpcao(opcao);
            } else {
                System.out.println("Opção inválida. Digite um número.");
                scanner.next(); // limpa entrada incorreta
            }
        }

        System.out.println("\nObrigado por usar o sistema. Volte sempre!");
    }

    /**
     * Exibe o menu principal.
     */
    private static void exibirMenu() {
        System.out.println("\n===============================");
        System.out.println("|      MENU DE INGRESSOS      |");
        System.out.println("===============================");
        System.out.println("| 1. Ingresso Comum           |");
        System.out.println("| 2. Meia Entrada             |");
        System.out.println("| 3. Ingresso Família         |");
        System.out.println("| 0. Sair                     |");
        System.out.println("===============================");
    }

    /**
     * Processa a opção escolhida pelo usuário.
     */
    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> comprarIngressoComum();
            case 2 -> comprarMeiaEntrada();
            case 3 -> comprarIngressoFamilia();
            case 0 -> System.out.println("\nSaindo do sistema...");
            default -> System.out.println("\nOpção inválida. Tente novamente.");
        }
    }

    // ===============================================================
    // MÉTODOS DE COMPRA
    // ===============================================================

    private static void comprarIngressoComum() {
        System.out.println("\n--- COMPRA DE INGRESSO COMUM ---");
        System.out.print("Digite o valor do ingresso: R$ ");
        double valor = scanner.nextDouble();

        System.out.print("Digite o nome do filme: ");
        scanner.nextLine(); // consome quebra de linha
        String nome = scanner.nextLine();

        System.out.print("O filme é dublado? (true/false): ");
        boolean dublado = scanner.nextBoolean();

        Ingresso ingresso = new Ingresso(valor, nome, dublado);
        ingresso.exibirInfo();
        System.out.println("Valor final: R$ " + ingresso.calcularValorReal());
    }

    private static void comprarMeiaEntrada() {
        System.out.println("\n--- COMPRA DE MEIA ENTRADA ---");
        System.out.print("Digite o valor do ingresso normal: R$ ");
        double valor = scanner.nextDouble();

        System.out.print("Digite o nome do filme: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.print("O filme é dublado? (true/false): ");
        boolean dublado = scanner.nextBoolean();

        MeiaEntrada meia = new MeiaEntrada(valor, nome, dublado);
        meia.exibirInfo();
        System.out.println("Valor final: R$ " + meia.calcularValorReal());
    }

    private static void comprarIngressoFamilia() {
        System.out.println("\n--- COMPRA DE INGRESSO FAMÍLIA ---");
        System.out.print("Digite o valor do ingresso base: R$ ");
        double valor = scanner.nextDouble();

        System.out.print("Digite o nome do filme: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.print("O filme é dublado? (true/false): ");
        boolean dublado = scanner.nextBoolean();

        System.out.print("Digite a quantidade de pessoas: ");
        int qtd = scanner.nextInt();

        IngressoFamilia familia = new IngressoFamilia(valor, nome, dublado, qtd);
        familia.exibirInfo();
    }
}
