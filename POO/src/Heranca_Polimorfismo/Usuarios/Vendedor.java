package Heranca_Polimorfismo.Usuarios;

/**
 * Representa um vendedor do sistema.
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class Vendedor extends Usuario {

    /** Quantidade total de vendas realizadas pelo vendedor. */
    private int quantidadeVendas;

    /**
     * Cria um novo vendedor com nome, email e senha informados.
     * Define automaticamente o atributo {@code administrador} como falso.
     *
     * @param nome nome do vendedor
     * @param email email corporativo do vendedor
     * @param senha senha de acesso do vendedor
     */
    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        setAdministrador(false);
        this.quantidadeVendas = 0;
    }

    /**
     * Registra uma nova venda e incrementa o contador de vendas do vendedor.
     * Exibe no console o total atualizado de vendas.
     */
    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada com sucesso!");
        System.out.println("Total de vendas: " + quantidadeVendas);
    }

    /**
     * Exibe no console o total de vendas realizadas pelo vendedor.
     */
    public void consultarVendas() {
        System.out.println("Vendas realizadas: " + quantidadeVendas);
    }

    /**
     * Retorna o número total de vendas realizadas pelo vendedor.
     *
     * @return quantidade de vendas registradas
     */
    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
}
