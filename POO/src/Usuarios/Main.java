package Usuarios;

/**
 * Classe principal responsável por demonstrar o funcionamento
 * do sistema de usuários.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class Main {

    /**
     * <p>Esse método executa uma simulação completa de uso do sistema:
     * criação de usuários, login, execução de tarefas específicas e logoff.</p>
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {


        Gerente gerente = new Gerente("Ana", "ana@empresa.com", "1234");
        Vendedor vendedor = new Vendedor("Carlos", "carlos@empresa.com", "abcd");
        Atendente atendente = new Atendente("João", "joao@empresa.com", "senha");


        gerente.realizarLogin("ana@empresa.com", "1234");
        vendedor.realizarLogin("carlos@empresa.com", "abcd");
        atendente.realizarLogin("joao@empresa.com", "senha");

        System.out.println();

        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();

        System.out.println();

        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();

        System.out.println();

        atendente.receberPagamento(150.00);
        atendente.receberPagamento(50.00);
        atendente.fecharCaixa();

        System.out.println();

        gerente.realizarLogoff();
    }
}
