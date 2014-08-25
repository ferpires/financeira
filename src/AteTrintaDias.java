import java.util.Calendar;


public class AteTrintaDias implements DataAgendamento {

	private Calendar dataAteTrintaDias = Calendar.getInstance();
	private DataAgendamento d;
	
	@Override
	public double calculoData(Agendamento a) {
		dataAteTrintaDias.add(Calendar.DAY_OF_MONTH, 30);
		if(a.getDataAgendamento().before(dataAteTrintaDias)){
			return a.getValorTransferencia() * 0.021;
		}
		return d.calculoData(a);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento d) {
		this.d = d;
	}

	
}
