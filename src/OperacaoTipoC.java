import java.math.BigDecimal;


public class OperacaoTipoC implements Taxa {

	private Taxa taxa;

	@Override
	public BigDecimal calculoTaxa(Agendamento agendamento) {
		CalculaTaxaPorDataRegressiva taxaRegressiva = new CalculaTaxaPorDataRegressiva();
		if(agendamento.getTipoTransferencia().equals(TipoTransferencia.C)){
			return taxaRegressiva.validaData(agendamento);
		}else {
			return taxa.calculoTaxa(agendamento);
		}
	}

	@Override
	public void setBuscaTaxaValida(Taxa taxa) {
		this.taxa = taxa;
	}

}
