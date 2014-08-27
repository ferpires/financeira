import java.math.BigDecimal;


public class CalculaTaxaPorOperacao {

	public BigDecimal taxa (Agendamento agendamento){
		OperacaoTipoD tipoD = new OperacaoTipoD();
		OperacaoTipoA tipoA = new OperacaoTipoA();
		OperacaoTipoB tipoB = new OperacaoTipoB();
		OperacaoTipoC tipoC = new OperacaoTipoC();
		
		tipoD.setBuscaTaxaValida(tipoA);
		tipoA.setBuscaTaxaValida(tipoB);
		tipoB.setBuscaTaxaValida(tipoC);
		
		return tipoD.calculoTaxa(agendamento);
	}
}
