import java.math.BigDecimal;
import java.util.Calendar;


public class AteVinteDias implements DataAgendamento {
	
	private Calendar dataAteVinteDias = Calendar.getInstance();
	private DataAgendamento dataAgendamento;
	
	@Override
	public BigDecimal calculoData(Agendamento agendamento) {
		dataAteVinteDias.add(Calendar.DAY_OF_MONTH, 20);
		if(agendamento.getDataAgendamento().before(dataAteVinteDias)){
			return agendamento.getValorTransferencia().multiply(new BigDecimal("0.054"));
		}
		return dataAgendamento.calculoData(agendamento);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

}
