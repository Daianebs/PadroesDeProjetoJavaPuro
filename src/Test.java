import edu.daianebs.strategy.*;;

public class Test {
    public static void main(String[] args) {
        LampadaInteligente lampada = new LampadaInteligente();

        // Criando as estratégias
        Iluminacao festa = new IluminacaoFesta();
        Iluminacao relaxamento = new IluminacaoRelaxamento();

        // Configurando e ajustando a iluminação
        lampada.setIluminacao(festa);
        lampada.ajustarIluminacao();  // Saída: Ajustando iluminação para um brilho colorido e dinâmico, perfeito para uma festa!

        lampada.setIluminacao(relaxamento);
        lampada.ajustarIluminacao();  // Saída: Ajustando iluminação para uma luz quente e suave, promovendo relaxamento...
    }
}
