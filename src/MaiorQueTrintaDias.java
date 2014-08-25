import java.util.Calendar;


public class MaiorQueTrintaDias implements DataAgendamento {

	private Calendar dataMaiorQueTrintaDias = Calendar.getInstance();
	private DataAgendamento d;
	
	@Override
	public double calculoData(Agendamento a) {
		dataMaiorQueTrintaDias.add(Calendar.DAY_OF_MONTH, 30);
		if(a.getDataAgendamento().after(dataMaiorQueTrintaDias)){
			return a.getValorTransferencia() * 0.012;
		}
		return d.calculoData(a);
	}

	@Override
	public void setBuscaDataValida(DataAgendamento d) {
		this.d = d;
	}

}
