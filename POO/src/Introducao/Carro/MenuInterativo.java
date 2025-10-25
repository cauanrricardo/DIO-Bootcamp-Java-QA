/**
 * Pacote contendo as classes de exercícios.
 */
package Introducao.Carro;

import java.util.Scanner;

/**
 * Classe principal responsável por exibir um menu interativo,
 * gerenciar e controlar uma instância da classe {@link Carro}.
 * Permite ao usuário simular operações como ligar, desligar, acelerar e trocar marcha.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class MenuInterativo {

    private static final Scanner scanner = new Scanner(System.in);
    private static Carro meuCarro;

    /**
     * Ponto de entrada principal da aplicação.
     * Cria uma instância da classe {@link Carro} e executa o loop
     * do menu principal para interagir com o simulador.
     *
     * @param args Argumentos de linha de comando (não utilizados nesta aplicação).
     */
    public static void main(String[] args) {
        System.out.println("--- BEM-VINDO ao Simulador de Carro  ---");

        // 1. Cria a instância do carro
        meuCarro = new Carro();
        System.out.println("Carro criado! Estado inicial: Desligado, Ponto Morto, 0 km/h.");

        int opcao = -1;

        // 2. Loop principal do Menu
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
     * Exibe o menu de opções de controle do carro no console.
     */
    private static void exibirMenu() {
        System.out.println("\n==================================");
        System.out.println("|         MENU DE CONTROLE       |");
        System.out.println("==================================");
        System.out.println("| 1. Ligar Carro                 |");
        System.out.println("| 2. Desligar Carro              |");
        System.out.println("| 3. Acelerar (+1 km/h)          |");
        System.out.println("| 4. Diminuir Velocidade (-1 km/h)|");
        System.out.println("| 5. Trocar Marcha               |");
        System.out.println("| 6. Virar (Esquerda/Direita)    |");
        System.out.println("| 7. Verificar Status Completo   |");
        System.out.println("| 0. Sair                        |");
        System.out.println("==================================");
    }

    /**
     * Processa a opção escolhida pelo usuário, chamando o método correspondente
     * na instância do {@link Carro} e tratando as entradas de novos valores.
     *
     * @param opcao O número da opção escolhida pelo usuário (0 a 7).
     */
    private static void processarOpcao(int opcao) {
        int novaMarcha;
        String direcao;

        switch (opcao) {
            case 1:
                meuCarro.ligar();
                break;
            case 2:
                meuCarro.desligar();
                break;
            case 3:
                meuCarro.acelerar();
                break;
            case 4:
                meuCarro.diminuirVelocidade();
                break;
            case 5:
                System.out.print("Para qual marcha deseja trocar (0 a 6)? ");
                if (scanner.hasNextInt()) {
                    novaMarcha = scanner.nextInt();
                    meuCarro.trocarMarcha(novaMarcha);
                } else {
                    System.out.println("Entrada inválida. Use um número inteiro para a marcha.");
                    scanner.next();
                }
                break;
            case 6:
                System.out.print("Para qual lado deseja virar (esquerda ou direita)? ");
                direcao = scanner.nextLine().trim(); // Lê a linha completa
                meuCarro.virar(direcao);
                break;
            case 7:
                meuCarro.verificarStatus();
                break;
            case 0:
                // Sair
                break;
            default:
                System.out.println("\nOpção " + opcao + " inválida. Tente uma das opções do menu.");
        }
    }
}