import java.util.Calendar;


public class AteCincoDias implements DataAgendamento {

	private Calendar dataAteCinco = Calendar.getInstance();
	private DataAgendamento d;
	
	@Override
	public double calculoData(Agendamento a) {
		dataAteCinco.add(Calendar.DAY_OF_MONTH, 5);
		if(a.getDataAgendamento().before(dataAteCinco)){
			return a.getValorTransferencia() * 0.083;
		}
		return d.calculoData(a);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento d) {
		this.d = d;
	}

}
