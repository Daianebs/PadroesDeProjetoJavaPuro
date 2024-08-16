package edu.daianebs.strategy;
/**
 * IluminacaoFesta: Representa uma iluminação mais animada, com cores e intensidade variáveis, ideal para festas
 */
public class IluminacaoFesta implements Iluminacao {
  @Override
  public void ajustar() {
      System.out.println("Ajustando iluminação para um brilho colorido e dinâmico, perfeito para uma festa!");
  }
}
