import java.util.Calendar;


public class AteVinteECincoDias implements DataAgendamento{

	private Calendar dataAteVinteECinco = Calendar.getInstance();
	private DataAgendamento d;
	
	@Override
	public double calculoData(Agendamento a) {
		dataAteVinteECinco.add(Calendar.DAY_OF_MONTH, 25);
		if(a.getDataAgendamento().before(dataAteVinteECinco)){
			return a.getValorTransferencia() * 0.043;
		}
		return d.calculoData(a);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento d) {
		this.d = d;
	}

}
