import java.math.BigDecimal;


public class OperacaoTipoA implements Taxa{

	private Taxa taxa;

	public BigDecimal calculoTaxa (Agendamento agendamento){
		if (agendamento.getTipoTransferencia().equals(TipoTransferencia.A)){
			return (agendamento.getValorTransferencia().multiply(new BigDecimal("0.03"))).add(new BigDecimal("2"));
		}else{
			return taxa.calculoTaxa(agendamento);
		}
	}

	@Override
	public void setBuscaTaxaValida(Taxa taxa) {
		this.taxa = taxa;
	}
}
