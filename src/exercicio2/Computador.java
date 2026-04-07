package exercicio2;

public class Computador {
    private String memoriaRam;
    private Processador processador;

    public Computador(String memoriaRam, Processador processador) {
        this.memoriaRam = memoriaRam;
        this.processador = processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public String detalhes(){
        return String.format("RAM: %s, Processador: %s, %s Ghz", this.memoriaRam, this.processador.getMarca(), this.processador.getVelocidadeGhz());
    }
}
