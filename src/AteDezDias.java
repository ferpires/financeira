import java.math.BigDecimal;
import java.util.Calendar;


public class AteDezDias implements DataAgendamento {
	private Calendar dataAteDez = Calendar.getInstance();
	private DataAgendamento dataAgendamento;
	
	@Override
	public BigDecimal calculoData(Agendamento agendamento) {
		dataAteDez.add(Calendar.DAY_OF_MONTH, 10);
		if(agendamento.getDataAgendamento().before(dataAteDez)){
			return agendamento.getValorTransferencia().multiply(new BigDecimal("0.074"));
		}
		return dataAgendamento.calculoData(agendamento);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
}
