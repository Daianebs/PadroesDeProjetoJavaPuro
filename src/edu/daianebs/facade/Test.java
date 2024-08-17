package edu.daianebs.facade;

/**
 * Classe principal para testar o padrão Facade em um sistema de e-commerce.
 * 
 * <p>
 * Este exemplo simplifica o processo de compra utilizando uma Facade para
 * gerenciar estoque, pagamento, envio e notificações.
 * </p>
 * 
 * @author Daianebs
 */
public class Test {

    public static void main(String[] args) {
        // Criação da Facade
        FacadeEcommerce ecommerceFacade = new FacadeEcommerce();

        // Processando uma compra
        ecommerceFacade.processarCompra("Notebook", 3500.00, "Rua Exemplo, 123, São Paulo, SP");
    }
}
