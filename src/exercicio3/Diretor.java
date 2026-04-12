package exercicio3;

public class Diretor {
    private String nome;
    private Integer tempoDeServico;

    public Diretor(String nome, Integer tempoDeServico) {
        this.nome = nome;
        this.tempoDeServico = tempoDeServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTempoDeServico() {
        return tempoDeServico;
    }

    public void setTempoDeServico(Integer tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }
}
