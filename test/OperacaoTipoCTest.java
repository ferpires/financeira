
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;


public class OperacaoTipoCTest {

	Calendar data = GregorianCalendar.getInstance();
	CalculaTaxaPorOperacao calculaTaxa = new CalculaTaxaPorOperacao();
	
	@Test
	public void testTipoCApos30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.C);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("1.2")) == 0);
	}
	
	@Test
	public void testTipoCAte30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 29);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.C);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("2.1")) == 0);
	}
	
	@Test
	public void testTipoCAte25Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 24);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.C);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("4.3")) == 0);
	}
	
	@Test
	public void testTipoCAte20Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 19);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.C);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("5.4")) == 0);
	}
	
	@Test
	public void testTipoCAte15Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 14);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.C);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("6.7")) == 0);
	}
	
	@Test
	public void testTipoCAte10Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 9);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.C);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("7.4")) == 0);
	}
	
	@Test
	public void testTipoCAte5Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.C);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("8.3")) == 0);
	}

}
