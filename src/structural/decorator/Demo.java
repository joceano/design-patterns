package structural.decorator;

public class Demo {

    public static void main(String[] args) {

        Pao francesComSalame = new Frances();
        francesComSalame = new Salame(francesComSalame);
        System.out.println(francesComSalame.getNome() + " - R$ " + francesComSalame.valor());

        //decorator
        Pao bagueteComCalabresaESalame = new Baguete();
        bagueteComCalabresaESalame = new Calabresa(bagueteComCalabresaESalame);
        bagueteComCalabresaESalame = new Salame(bagueteComCalabresaESalame);
        System.out.println(bagueteComCalabresaESalame.getNome() + " - R$ " + bagueteComCalabresaESalame.valor());
    }
}
