import java.math.BigDecimal;
import java.util.Calendar;


public class MaiorQueTrintaDias implements DataAgendamento {

	private Calendar dataMaiorQueTrintaDias = Calendar.getInstance();
	private DataAgendamento dataAgendamento;
	
	@Override
	public BigDecimal calculoData(Agendamento agendamento) {
		dataMaiorQueTrintaDias.add(Calendar.DAY_OF_MONTH, 30);
		if(agendamento.getDataAgendamento().after(dataMaiorQueTrintaDias)){
			return agendamento.getValorTransferencia().multiply(new BigDecimal("0.012"));
		}
		return dataAgendamento.calculoData(agendamento);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

}
