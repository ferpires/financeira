import java.util.Calendar;


public class OperacaoTipoB implements Taxa{

	private Taxa t;
	private Calendar dataTrintaDias = Calendar.getInstance();
	private double taxa;

	public double calculoTaxa (Agendamento a){
		if(a.getTipoTransferencia().equals("B")){
			dataTrintaDias.add(Calendar.DAY_OF_MONTH, 30);
			if(a.getDataAgendamento().before(dataTrintaDias)){
				taxa = 10;
			} else {
				taxa = 8;
			}
			return taxa;
		}
		return t.calculoTaxa(a);
	}

	@Override
	public void setBuscaTaxaValida(Taxa t) {
		this.t = t;
	}

}
