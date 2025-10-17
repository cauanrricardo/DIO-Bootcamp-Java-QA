package Conta_Bancaria;

import java.util.Scanner;

/**
 * Classe principal responsável por exibir um menu interativo ao usuário,
 * gerenciar a entrada de dados e realizar operações em uma instância de {@link ContaBancaria}.
 * É a classe de execução do sistema bancário.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class MenuInterativo {

    private static final Scanner scanner = new Scanner(System.in);
    private static ContaBancaria conta;

    /**
     * Ponto de entrada principal da aplicação.
     * Inicializa a conta bancária solicitando um depósito inicial e,
     * em seguida, executa o loop do menu de operações.
     *
     * @param args Argumentos de linha de comando (não utilizados nesta aplicação).
     */
    public static void main(String[] args) {
        System.out.println("--- BEM-VINDO ao Sistema Bancário  ---");

        // 1. Criação da Conta Bancária (Deve ter depósito inicial)
        double depositoInicial = 0;
        while (depositoInicial <= 0) {
            System.out.print("Para começar, digite o valor do depósito inicial (mínimo R$0.01): R$ ");
            if (scanner.hasNextDouble()) { //optei pelo hasNext pra ter mais robustez no programa, caso o usuaruo digite um tipo inesperado
                depositoInicial = scanner.nextDouble();
                if (depositoInicial <= 0) {
                    System.out.println("Valor inválido. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next(); // Consome a entrada inválida
            }
        }
        // A classe ContaBancaria é instanciada
        conta = new ContaBancaria(depositoInicial);//;passado como argumento(o mesmo qeu esta no construtor)
        System.out.println("\nConta criada com sucesso! Limite de Cheque Especial calculado.");

        // 2. Loop principal do Menu
        int opcao = -1;
        while (opcao != 0) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                processarOpcao(opcao);
            } else {
                System.out.println("\nOpção inválida. Por favor, digite um número.");
                scanner.next(); // Consome a entrada inválida
            }
        }

        System.out.println("\nObrigado por utilizar o sistema. Encerrando execução.");
    }

    /**
     * Exibe o menu de opções disponíveis para a conta bancária no console.
     */
    private static void exibirMenu() {
        System.out.println("\n==================================");
        System.out.println("|      MENU DE OPERAÇÕES         |");
        System.out.println("==================================");
        System.out.println("| 1. Consultar Saldo             |");
        System.out.println("| 2. Consultar Cheque Especial   |");
        System.out.println("| 3. Depositar Dinheiro          |");
        System.out.println("| 4. Sacar Dinheiro              |");
        System.out.println("| 5. Pagar Boleto                |");
        System.out.println("| 6. Verificar Uso Cheque Esp.   |");
        System.out.println("| 0. Sair                        |");
        System.out.println("==================================");
    }

    /**
     * Processa a opção escolhida pelo usuário, chamando o método correspondente
     * da {@link ContaBancaria} ou realizando uma ação de controle.
     *
     * @param opcao O número da opção escolhida pelo usuário (0 a 6).
     */
    private static void processarOpcao(int opcao) {
        double valor;
        switch (opcao) {
            case 1:
                conta.consultarSaldo();
                break;
            case 2:
                conta.consultarChequeEspecial();
                break;
            case 3:
                System.out.print("Digite o valor do depósito: R$ ");
                if (scanner.hasNextDouble()) {
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                } else {
                    System.out.println("Valor inválido.");
                    scanner.next();
                }
                break;
            case 4:
                System.out.print("Digite o valor do saque: R$ ");
                if (scanner.hasNextDouble()) {
                    valor = scanner.nextDouble();
                    conta.sacar(valor);
                } else {
                    System.out.println("Valor inválido.");
                    scanner.next();
                }
                break;
            case 5:
                System.out.print("Digite o valor do boleto: R$ ");
                if (scanner.hasNextDouble()) {
                    valor = scanner.nextDouble();
                    conta.pagarBoleto(valor);
                } else {
                    System.out.println("Valor inválido.");
                    scanner.next();
                }
                break;
            case 6:
                if (conta.verificarUsoChequeEspecial()) {
                    System.out.println("\nSTATUS: Sim, a conta está utilizando o Cheque Especial!");
                } else {
                    System.out.println("\nSTATUS: Não, a conta NÃO está utilizando o Cheque Especial.");
                }
                break;
            case 0:
                // Sai do loop no main
                break;
            default:
                System.out.println("\nOpção inválida. Tente novamente.");
        }
    }
}