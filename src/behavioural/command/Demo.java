package behavioural.command;

import behavioural.command.pedido.GeraPedido;
import behavioural.command.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class Demo {

    public static void main(String[] args) {
        GeraPedido gerador = new GeraPedido("Ana da Silva", new BigDecimal("600"), 6);

        GeraPedidoHandler handler = new GeraPedidoHandler();
        //command
        handler.executa(gerador);
    }
}
