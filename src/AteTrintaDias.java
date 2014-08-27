import java.math.BigDecimal;
import java.util.Calendar;


public class AteTrintaDias implements DataAgendamento {

	private Calendar dataAteTrintaDias = Calendar.getInstance();
	private DataAgendamento dataAgendamento;
	
	@Override
	public BigDecimal calculoData(Agendamento agendamento) {
		dataAteTrintaDias.add(Calendar.DAY_OF_MONTH, 30);
		if(agendamento.getDataAgendamento().before(dataAteTrintaDias)){
			return agendamento.getValorTransferencia().multiply(new BigDecimal("0.021"));
		}
		return dataAgendamento.calculoData(agendamento);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	
}
