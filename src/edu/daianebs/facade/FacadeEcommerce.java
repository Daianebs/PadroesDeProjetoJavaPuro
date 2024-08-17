package edu.daianebs.facade;

/**
 * Facade que simplifica o processo de compra em um sistema de e-commerce.
 * 
 * <p>
 * A classe FacadeEcommerce fornece uma interface unificada para gerenciar
 * o estoque, processar o pagamento, organizar o envio e enviar notificações,
 * encapsulando a complexidade de lidar com cada subsistema separadamente.
 * </p>
 * 
 * @author Daianebs
 */
public class FacadeEcommerce {

    private GestaoEstoque gestaoEstoque;
    private SistemaPagamento sistemaPagamento;
    private GestaoEnvio gestaoEnvio;
    private Notificacao notificacao;

    /**
     * Construtor que inicializa as classes do subsistema.
     */
    public FacadeEcommerce() {
        this.gestaoEstoque = new GestaoEstoque();
        this.sistemaPagamento = new SistemaPagamento();
        this.gestaoEnvio = new GestaoEnvio();
        this.notificacao = new Notificacao();
    }

    /**
     * Processa uma compra completa no sistema de e-commerce.
     * 
     * @param produto  Nome do produto a ser comprado.
     * @param valor    Valor do produto.
     * @param endereco Endereço de entrega.
     */
    public void processarCompra(String produto, double valor, String endereco) {
        // Verificar disponibilidade do produto
        if (gestaoEstoque.verificarDisponibilidade(produto)) {
            // Processar pagamento
            if (sistemaPagamento.processarPagamento(valor)) {
                //enviar notificação por email
                notificacao.enviarNotificacao("Pagamento Aprovado! O pagamento do produto " + produto + " no valor de "+ valor + " está aprovado. O vendedor já foi notificado e enviará seu pedido em breve." ,"e-mail");
                // Organizar envio
                gestaoEnvio.organizarEnvio(produto, endereco);
                // Enviar notificação por sms
                notificacao.enviarNotificacao("Seu pedido foi enviado para: " + endereco, "SMS");
                System.out.println("Compra processada com sucesso!");
            } else {
                System.out.println("Falha no processamento do pagamento.");
            }
        } else {
            System.out.println("Produto indisponível no estoque.");
        }
    }
}
