import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;


public class OperacaoTipoATest {

	Calendar data = GregorianCalendar.getInstance();
	CalculaTaxaPorOperacao calculaTaxa = new CalculaTaxaPorOperacao();
	
	@Test
	public void testTipoA100Reais() {
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.A);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("5")) == 0);
	}
	
	@Test
	public void testTipoA200Reais() {
		Agendamento agendamento = new Agendamento(new BigDecimal("200"), data, TipoTransferencia.A);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("8")) == 0);
	}

	@Test
	public void testTipoA1600Reais() {
		Agendamento agendamento = new Agendamento(new BigDecimal("1600"), data, TipoTransferencia.A);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("50")) == 0);
	}
	
}
