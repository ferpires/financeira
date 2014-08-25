import java.util.Calendar;


public class AteVinteDias implements DataAgendamento {
	
	private Calendar dataAteVinteDias = Calendar.getInstance();
	private DataAgendamento d;
	
	@Override
	public double calculoData(Agendamento a) {
		dataAteVinteDias.add(Calendar.DAY_OF_MONTH, 20);
		if(a.getDataAgendamento().before(dataAteVinteDias)){
			return a.getValorTransferencia() * 0.054;
		}
		return d.calculoData(a);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento d) {
		this.d = d;
	}

}
