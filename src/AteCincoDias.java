import java.math.BigDecimal;
import java.util.Calendar;


public class AteCincoDias implements DataAgendamento {

	private Calendar dataAteCinco = Calendar.getInstance();
	private DataAgendamento dataAgendamento;
	
	@Override
	public BigDecimal calculoData(Agendamento agendamento) {
		dataAteCinco.add(Calendar.DAY_OF_MONTH, 5);
		if(agendamento.getDataAgendamento().before(dataAteCinco)){
			return agendamento.getValorTransferencia().multiply(new BigDecimal("0.083"));
		}
		return dataAgendamento.calculoData(agendamento);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

}
