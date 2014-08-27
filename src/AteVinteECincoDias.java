import java.math.BigDecimal;
import java.util.Calendar;


public class AteVinteECincoDias implements DataAgendamento{

	private Calendar dataAteVinteECinco = Calendar.getInstance();
	private DataAgendamento dataAgendamento;
	
	@Override
	public BigDecimal calculoData(Agendamento agendamento) {
		dataAteVinteECinco.add(Calendar.DAY_OF_MONTH, 25);
		if(agendamento.getDataAgendamento().before(dataAteVinteECinco)){
			return agendamento.getValorTransferencia().multiply(new BigDecimal("0.043"));
		}
		return dataAgendamento.calculoData(agendamento);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

}
