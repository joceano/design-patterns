package behavioural.strategy;

public class Demo {

    public static void main(String[] args) {

        var pedido = new Pedido(Double.valueOf("10"));

        var calculadoraSantander = new CalculadoraDeJuros(new Santander());
        var jurosSantander = calculadoraSantander.calculaJuros(pedido);
        System.out.println(jurosSantander);

        var calculadoraItau = new CalculadoraDeJuros(new Itau());
        var jurosItau = calculadoraItau.calculaJuros(pedido);
        System.out.println(jurosItau);

    }
}
