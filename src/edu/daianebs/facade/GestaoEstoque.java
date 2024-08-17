package edu.daianebs.facade;

/**
 * Classe responsável pela gestão de estoque.
 * 
 * <p>
 * Verifica a disponibilidade de produtos no estoque.
 * </p>
 * 
 * @author Daianebs
 */
public class GestaoEstoque {

    /**
     * Verifica se o produto está disponível em estoque.
     * 
     * @param produto Nome do produto a ser verificado.
     * @return true se o produto estiver disponível, false caso contrário.
     */
    public boolean verificarDisponibilidade(String produto) {
        System.out.println("Verificando disponibilidade do produto: " + produto);
        // Simulação de verificação de estoque
        return true; // Assume que o produto está disponível
    }
}
