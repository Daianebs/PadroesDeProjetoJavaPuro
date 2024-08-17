package edu.daianebs.facade;

/**
 * Classe responsável pela gestão de envio.
 * 
 * <p>
 * Organiza o envio e o rastreamento do pedido.
 * </p>
 * 
 * @autor Daianebs
 */
public class GestaoEnvio {

    /**
     * Organiza o envio do pedido para o cliente.
     * 
     * @param produto  Nome do produto a ser enviado.
     * @param endereco Endereço de entrega.
     */
    public void organizarEnvio(String produto, String endereco) {
        System.out.println("Organizando envio do produto: " + produto + " para o endereço: " + endereco);
        // Simulação de organização de envio
    }
}
