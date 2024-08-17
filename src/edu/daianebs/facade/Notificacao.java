package edu.daianebs.facade;

/**
 * Classe responsável pelo envio de notificações.
 * 
 * <p>
 * Envia confirmações de pedido e envio por e-mail ou SMS.
 * </p>
 * 
 * @autor Daianebs
 */
public class Notificacao {

    /**
     * Envia uma notificação ao cliente.
     * 
     * @param mensagem Mensagem da notificação.
     * @param meio     Meio de envio (e-mail ou SMS).
     */
    public void enviarNotificacao(String mensagem, String meio) {
        System.out.println("Enviando notificação por " + meio + ": " + mensagem);
        // Simulação de envio de notificação
    }
}
