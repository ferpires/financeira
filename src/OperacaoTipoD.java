
public class OperacaoTipoD implements Taxa {

	private Taxa t;

	@Override
	public double calculoTaxa(Agendamento a) {
		if(a.getTipoTransferencia().equals("D")){
			if(a.getValorTransferencia() <= 25000){
				a.setTipoTransferencia("A");
			}else if(a.getValorTransferencia() <= 120000){
				a.setTipoTransferencia("B");
			}else if(a.getValorTransferencia() > 120000){
				a.setTipoTransferencia("C");
			}
			return t.calculoTaxa(a);
		}else {
			return t.calculoTaxa(a);
		}
	}

	@Override
	public void setBuscaTaxaValida(Taxa t) {
		this.t = t;
	}

}
