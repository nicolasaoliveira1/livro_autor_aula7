package exercicio2;

public class MainExercicio2 {
    static void main() {
        Processador processador = new Processador("Intel", 50f);
        Computador computador = new Computador("8GB", processador);

        System.out.println(computador.detalhes());
    }
}
