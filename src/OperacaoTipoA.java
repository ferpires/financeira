
public class OperacaoTipoA implements Taxa{

	private Taxa t;

	public double calculoTaxa (Agendamento a){
		if (a.getTipoTransferencia().equals("A")){
			return (a.getValorTransferencia() * 0.03 ) + 2;
		}else{
			return t.calculoTaxa(a);
		}
	}

	@Override
	public void setBuscaTaxaValida(Taxa t) {
		this.t = t;
	}
}
