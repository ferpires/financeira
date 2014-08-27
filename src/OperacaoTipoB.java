import java.math.BigDecimal;
import java.util.Calendar;


public class OperacaoTipoB implements Taxa{

	private Taxa taxa;
	private Calendar dataTrintaDias = Calendar.getInstance();
	private BigDecimal taxaFinal;

	public BigDecimal calculoTaxa (Agendamento a){
		if(a.getTipoTransferencia().equals(TipoTransferencia.B)){
			dataTrintaDias.add(Calendar.DAY_OF_MONTH, 30);
			if(a.getDataAgendamento().before(dataTrintaDias)){
				taxaFinal = new BigDecimal("10");
			} else {
				taxaFinal = new BigDecimal("8");
			}
			return taxaFinal;
		}
		return taxa.calculoTaxa(a);
	}

	@Override
	public void setBuscaTaxaValida(Taxa taxa) {
		this.taxa = taxa;
	}

}
