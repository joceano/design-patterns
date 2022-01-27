package behavioural.observer;

import behavioural.observer.acao.EnviarEmailPedido;
import behavioural.observer.acao.SalvarPedidoNoBancoDeDados;
import behavioural.observer.pedido.GeraPedido;
import behavioural.observer.pedido.GeraPedidoHandler;

import java.math.BigDecimal;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        GeraPedido gerador = new GeraPedido("Ana da Silva", new BigDecimal("600"), 6);

        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
        );
        handler.executa(gerador);
    }
}
