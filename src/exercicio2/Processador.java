package exercicio2;

public class Processador {
    private String marca;
    private Float velocidadeGhz;

    public Processador(String marca, Float velocidadeGhz) {
        this.marca = marca;
        this.velocidadeGhz = velocidadeGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getVelocidadeGhz() {
        return velocidadeGhz;
    }

    public void setVelocidadeGhz(Float velocidadeGhz) {
        this.velocidadeGhz = velocidadeGhz;
    }
}
