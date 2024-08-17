package edu.daianebs.facade;

/**
 * Classe responsável pelo processamento de pagamentos.
 * 
 * <p>
 * Processa o pagamento de uma compra.
 * </p>
 * 
 * @autor Daianebs
 */
public class SistemaPagamento {

    /**
     * Processa o pagamento da compra.
     * 
     * @param valor Valor da compra a ser pago.
     * @return true se o pagamento foi bem-sucedido, false caso contrário.
     */
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor);
        // Simulação de processamento de pagamento
        return true; // Assume que o pagamento foi bem-sucedido
    }
}
