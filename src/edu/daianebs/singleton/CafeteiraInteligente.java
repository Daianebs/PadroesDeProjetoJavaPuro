package edu.daianebs.singleton;


/**
 * A classe CafeteiraInteligente implementa o padrão Singleton, garantindo que apenas
 * uma instância da cafeteira seja criada para gerenciar o preparo do café no escritório.
 *
 * <p>Esta classe simula uma cafeteira inteligente que só pode ser acessada por meio
 * de uma única instância, garantindo consistência no preparo do café.</p>
 *
 * @author daianebs
 */
public class CafeteiraInteligente {

  // A única instância da CafeteiraInteligente (Singleton)
  private static CafeteiraInteligente instanciaUnica;

  // Estado da cafeteira
  private boolean cafePronto;

  /**
   * Construtor privado para impedir a criação de novas instâncias fora da classe.
   */
  private CafeteiraInteligente() {
      this.cafePronto = false;
  }

  /**
   * Método público e estático para acessar a instância única da cafeteira.
   *
   * <p>Se a instância ainda não foi criada, ela é criada neste momento.
   * Caso contrário, a instância existente é retornada.</p>
   *
   * @return A instância única de CafeteiraInteligente.
   */
  public static synchronized CafeteiraInteligente getInstancia() {
      if (instanciaUnica == null) {
          instanciaUnica = new CafeteiraInteligente();
      }
      return instanciaUnica;
  }

  /**
   * Prepara o café se ainda não estiver pronto.
   */
  public void prepararCafe() {
      if (!cafePronto) {
          System.out.println("Preparando o café...");
          cafePronto = true;
          System.out.println("Café pronto! Pode servir.");
      } else {
          System.out.println("O café já está pronto! Aproveite.");
      }
  }

  /**
   * Reinicia a cafeteira para preparar mais café.
   */
  public void reiniciarCafeteira() {
      System.out.println("Reiniciando a cafeteira...");
      cafePronto = false;
  }
}