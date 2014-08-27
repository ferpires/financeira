import java.math.BigDecimal;
import java.util.Calendar;


public class AteQuinzeDias implements DataAgendamento {
	private Calendar dataAteQuinze = Calendar.getInstance();
	private DataAgendamento dataAgendamento;
	
	@Override
	public BigDecimal calculoData(Agendamento agendamento) {
		dataAteQuinze.add(Calendar.DAY_OF_MONTH, 15);
		if(agendamento.getDataAgendamento().before(dataAteQuinze)){
			return agendamento.getValorTransferencia().multiply(new BigDecimal("0.067"));
		}
		return dataAgendamento.calculoData(agendamento);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
}
