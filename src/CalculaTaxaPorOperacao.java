
public class CalculaTaxaPorOperacao {

	public double taxa (Agendamento a){
		OperacaoTipoD tipoD = new OperacaoTipoD();
		OperacaoTipoA tipoA = new OperacaoTipoA();
		OperacaoTipoB tipoB = new OperacaoTipoB();
		OperacaoTipoC tipoC = new OperacaoTipoC();
		
		tipoD.setBuscaTaxaValida(tipoA);
		tipoA.setBuscaTaxaValida(tipoB);
		tipoB.setBuscaTaxaValida(tipoC);
		
		return tipoD.calculoTaxa(a);
	}
}
