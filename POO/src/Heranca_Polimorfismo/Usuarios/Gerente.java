package Heranca_Polimorfismo.Usuarios;

/**
 * Representa um gerente do sistema.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class Gerente extends Usuario {

    /**
     * Cria um novo gerente com nome, email e senha informados.
     * Define automaticamente o atributo {@code administrador} como verdadeiro.
     *
     * @param nome nome do gerente
     * @param email email corporativo do gerente
     * @param senha senha de acesso do gerente
     */
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        setAdministrador(true);
    }

    /**
     * Gera um relatório financeiro fictício contendo informações
     * gerais de desempenho da empresa.
     *
     * <p>Esse método apenas simula a geração de um relatório,
     * exibindo dados fixos para fins de demonstração.</p>
     */
    public void gerarRelatorioFinanceiro() {
        System.out.println("====== RELATÓRIO FINANCEIRO ======");
        System.out.println("Gerente: " + getNome());
        System.out.println("Total de vendas realizadas: R$ 12.500,00");
        System.out.println("Total recebido em caixa: R$ 8.300,00");
        System.out.println("Despesas operacionais: R$ 4.200,00");
        System.out.println("Lucro líquido estimado: R$ 4.100,00");
        System.out.println("================================");
    }

    /**
     * Exibe um relatório geral de vendas do sistema.
     *
     * <p>O relatório apresenta informações resumidas e simuladas,
     * representando o total de vendas e o faturamento global.</p>
     */
    public void consultarVendas() {
        System.out.println("===== RELATÓRIO DE VENDAS GERAL =====");
        System.out.println("Gerente: " + getNome());
        System.out.println("Total de vendas realizadas no sistema: 250");
        System.out.println("Faturamento total estimado: R$ 32.800,00");
        System.out.println("======================================");
    }
}
