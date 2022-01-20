package structural.decorator;

public class Baguete extends Pao {

    public Baguete() {
        this.nome = "Baguete";
    }

    public Double valor() {
        return Double.valueOf("3");
    }
}
