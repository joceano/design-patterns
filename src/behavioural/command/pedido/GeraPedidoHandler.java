package behavioural.command.pedido;

import behavioural.command.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        System.out.println("Salvar pedido no banco de dados.");
        System.out.println("Enviar e-mail.");
    }
}
