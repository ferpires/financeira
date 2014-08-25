import java.util.Calendar;


public class AteQuinzeDias implements DataAgendamento {
	private Calendar dataAteQuinze = Calendar.getInstance();
	private DataAgendamento d;
	
	@Override
	public double calculoData(Agendamento a) {
		dataAteQuinze.add(Calendar.DAY_OF_MONTH, 15);
		if(a.getDataAgendamento().before(dataAteQuinze)){
			return a.getValorTransferencia() * 0.067;
		}
		return d.calculoData(a);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento d) {
		this.d = d;
	}
}
