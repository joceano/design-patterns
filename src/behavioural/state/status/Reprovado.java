package behavioural.state.status;

import behavioural.state.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

    @Override
    public String toString() {
        return "Finalizado";
    }
}
