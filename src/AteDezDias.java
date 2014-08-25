import java.util.Calendar;


public class AteDezDias implements DataAgendamento {
	private Calendar dataAteDez = Calendar.getInstance();
	private DataAgendamento d;
	
	@Override
	public double calculoData(Agendamento a) {
		dataAteDez.add(Calendar.DAY_OF_MONTH, 10);
		if(a.getDataAgendamento().before(dataAteDez)){
			return a.getValorTransferencia() * 0.074;
		}
		return d.calculoData(a);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento d) {
		this.d = d;
	}
}
