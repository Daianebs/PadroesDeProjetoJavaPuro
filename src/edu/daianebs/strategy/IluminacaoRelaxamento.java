package edu.daianebs.strategy;
/**
 * IluminacaoRelaxamento: Representa uma luz suave e quente, adequada para momentos de relaxamento.
 */
public class IluminacaoRelaxamento implements Iluminacao {
  @Override
  public void ajustar() {
      System.out.println("Ajustando iluminação para uma luz quente e suave, promovendo relaxamento...");
  }
}
