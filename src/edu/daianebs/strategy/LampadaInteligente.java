package edu.daianebs.strategy;

/**
 * Strategy
 *
 * <p>A LampadaInteligente tem um <b>campo iluminacao</b> que representa a estratégia atual de iluminação.
 * Imagine que você está em sua casa, e conforme o ambiente e a situação mudam, 
 * você ajusta as luzes para criar a atmosfera ideal.
 * Essa alusão facilita a compreensão e memorização do padrão Strategy:
 * dependendo da situação, você troca a estratégia para obter o comportamento desejado.</p>
 * 
 *  @author daianebs
 */
public class LampadaInteligente {
    private Iluminacao iluminacao;

    /**
     * O método setIluminacao() permite alterar a estratégia de iluminação.
     * <p>Este método é utilizado para mudar a implementação concreta da interface Iluminacao, 
     * possibilitando que a lâmpada inteligente se adapte a diferentes ambientes ou condições.</p>
     *
     * @param iluminacao A nova estratégia de iluminação a ser configurada.
     */
    public void setIluminacao(Iluminacao iluminacao) {
        this.iluminacao = iluminacao;
    }

    /**
     * O método ajustarIluminacao() chama o método ajustar() da estratégia atualmente configurada.
     * <p>Este método invoca o comportamento específico da estratégia de iluminação que foi previamente 
     * configurada, permitindo que a lâmpada se comporte de acordo com o contexto atual.</p>
     */
    public void ajustarIluminacao() {
        iluminacao.ajustar();
    }
}
