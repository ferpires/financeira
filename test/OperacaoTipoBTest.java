import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;


public class OperacaoTipoBTest {

	Calendar data = GregorianCalendar.getInstance();
	CalculaTaxaPorOperacao calculaTaxa = new CalculaTaxaPorOperacao();
	
	
	@Test
	public void testTipoBAte30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 20);
		Agendamento agendamento = new Agendamento(new BigDecimal("100000"), data, TipoTransferencia.B);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal(10)) == 0);
	}
	
	@Test
	public void testTipoDApos30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento agendamento = new Agendamento(new BigDecimal("100000"), data, TipoTransferencia.B);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal(8)) == 0);
	}

}
