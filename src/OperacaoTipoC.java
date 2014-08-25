
public class OperacaoTipoC implements Taxa {

	private Taxa t;

	@Override
	public double calculoTaxa(Agendamento a) {
		CalculaTaxaPorDataRegressiva taxaRegressiva = new CalculaTaxaPorDataRegressiva();
		if(a.getTipoTransferencia().equals("C")){
			return taxaRegressiva.validaData(a);
		}else {
			return t.calculoTaxa(a);
		}
	}

	@Override
	public void setBuscaTaxaValida(Taxa t) {
		this.t = t;
	}

}
