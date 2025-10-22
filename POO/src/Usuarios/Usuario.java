package Usuarios;

import java.util.Scanner;

/**
 * Representa um usuário genérico do sistema.
 *
 * <p>Essa classe contém os principais atributos e comportamentos comuns
 * a todos os tipos de usuários, como login, logoff e alteração de dados.
 * As classes {@code Gerente}, {@code Vendedor} e {@code Atendente} herdam
 * dessa classe para especializar suas próprias funções.</p>
 *
 * @author cauanricardoribeiro
 * @version 1.0
 */
public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private boolean administrador;
    private boolean logado;

    /** Scanner utilizado para leitura de dados do usuário no console. */
    private static final Scanner sc = new Scanner(System.in);

    /**
     * Constrói um novo usuário com nome, email e senha informados.
     * O atributo {@code administrador} inicia como falso por padrão.
     *
     * @param nome nome do usuário
     * @param email email de login do usuário
     * @param senha senha de acesso do usuário
     */
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
        this.logado = false;
    }

    /**
     * Retorna se o usuário possui permissão de administrador.
     *
     * @return {@code true} se for administrador, {@code false} caso contrário
     */
    public boolean isAdministrador() {
        return administrador;
    }

    /**
     * Define se o usuário é administrador.
     *
     * @param administrador valor lógico para o atributo administrador
     */
    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    /**
     * Retorna o email do usuário.
     *
     * @return email cadastrado do usuário
     */
    public String getEmail() {
        return email;
    }

    /**
     * Retorna o nome do usuário.
     *
     * @return nome do usuário
     */
    public String getNome() {
        return nome;
    }

    /**
     * Atualiza o nome do usuário.
     *
     * @param nome novo nome a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Atualiza o email do usuário.
     *
     * @param email novo email a ser definido
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna a senha atual do usuário.
     *
     * @return senha do usuário
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Atualiza a senha do usuário.
     *
     * @param senha nova senha a ser definida
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Realiza o login do usuário verificando o email e a senha informados.
     *
     * @param emailCorreto email digitado pelo usuário
     * @param senhaCorreta senha digitada pelo usuário
     */
    public void realizarLogin(String emailCorreto, String senhaCorreta) {
        if (this.email.equals(emailCorreto) && this.senha.equals(senhaCorreta)) {
            logado = true;
            System.out.println("Acesso Liberado");
        } else {
            logado = false;
            System.out.println("ERRO: Acesso Negado - Senha ou email incorreto");
        }
    }

    /**
     * Encerra a sessão do usuário logado.
     * Exibe uma mensagem caso o usuário já esteja deslogado.
     */
    public void realizarLogoff() {
        if (logado) {
            logado = false;
            System.out.println("Usuário Desconectado");
        } else {
            System.out.println("Usuário já está deslogado");
        }
    }

    /**
     * Permite ao usuário alterar seus dados de nome, email ou senha.
     * A interação é feita via console.
     */
    public void alterarDados() {
        System.out.println("====== ALTERAR DADOS =======");
        System.out.println("Selecione a opção pra alterar os dados: ");
        System.out.println("(1) : Nome");
        System.out.println("(2) : Email");
        System.out.println("(3) : Senha");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Seu nome atual: " + getNome());
                System.out.println("Digite seu novo nome: ");
                String novoNome = sc.nextLine();
                setNome(novoNome);
                System.out.println("Nome alterado com sucesso!");
                System.out.println("Novo nome: " + getNome());
                break;

            case 2:
                System.out.println("Seu email atual :" + getEmail());
                System.out.println("Digite seu novo email: ");
                String novoEmail = sc.nextLine();
                setEmail(novoEmail);
                System.out.println("Email alterado com sucesso!");
                System.out.println("Novo email: " + getEmail());
                break;

            case 3:
                alterarSenha();
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }

    /**
     * Permite ao usuário alterar sua senha, solicitando a senha atual
     * e validando antes de aplicar a alteração.
     */
    public void alterarSenha() {
        System.out.println("Digite sua senha atual: ");
        String senhaAtual = sc.nextLine();
        if (senhaAtual.equals(getSenha())) {
            System.out.println("Digite sua nova senha: ");
            String novaSenha = sc.nextLine();
            setSenha(novaSenha);
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("ERRO: Senha incorreta. Tente novamente!");
        }
    }
}
