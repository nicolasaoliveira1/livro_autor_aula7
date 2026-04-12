package exercicio3;

public class MainExercicio3 {
    static void main() {
        Diretor diretor = new Diretor("Claudio", 10);
        Escola escola = new Escola("Sao Jose", "Rua Feliz 123", diretor);

        System.out.println(escola.apresentarEscola());
    }
}
