import java.math.BigDecimal;


public class OperacaoTipoD implements Taxa {

	private Taxa taxa;

	@Override
	public BigDecimal calculoTaxa(Agendamento agendamento) {
		if(agendamento.getTipoTransferencia().equals(TipoTransferencia.D)){
			if(agendamento.getValorTransferencia().compareTo(new BigDecimal(25000)) <= 0){
				agendamento.setTipoTransferencia(TipoTransferencia.A);
			}else if(agendamento.getValorTransferencia().compareTo(new BigDecimal(120000)) <= 0){
				agendamento.setTipoTransferencia(TipoTransferencia.B);
			}else if(agendamento.getValorTransferencia().compareTo(new BigDecimal(120000)) > 0){
				agendamento.setTipoTransferencia(TipoTransferencia.C);
			}
			return taxa.calculoTaxa(agendamento);
		}else {
			return taxa.calculoTaxa(agendamento);
		}
	}

	@Override
	public void setBuscaTaxaValida(Taxa taxa) {
		this.taxa = taxa;
	}

}
