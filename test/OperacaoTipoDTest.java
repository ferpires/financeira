
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;


public class OperacaoTipoDTest {
	
	Calendar data = GregorianCalendar.getInstance();
	CalculaTaxaPorOperacao calculaTaxa = new CalculaTaxaPorOperacao();
	
	// C
	@Test
	public void testTipoDApos30DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento agendamento = new Agendamento(new BigDecimal("200000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("2400")) == 0);
	}
	
	@Test
	public void testTipoDAte30DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 29);
		Agendamento agendamento = new Agendamento(new BigDecimal("200000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("4200")) == 0);
	}
	
	@Test
	public void testTipoDAte25DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 24);
		Agendamento agendamento = new Agendamento(new BigDecimal("200000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("8600")) == 0);
	}
	
	@Test
	public void testTipoDAte20DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 19);
		Agendamento agendamento = new Agendamento(new BigDecimal("200000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("10800")) == 0);
	}
	
	@Test
	public void testTipoDAte15DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 14);
		Agendamento agendamento = new Agendamento(new BigDecimal("200000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("13400")) == 0);
	}
	
	@Test
	public void testTipoDAte10DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 9);
		Agendamento agendamento = new Agendamento(new BigDecimal("200000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("14800")) == 0);
	}
	
	@Test
	public void testTipoDAte5DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento agendamento = new Agendamento(new BigDecimal("200000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("16600")) == 0);
	}
	
	// B
	@Test
	public void testTipoDAte5DiasAte120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento agendamento = new Agendamento(new BigDecimal("100000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("10")) == 0);
	}
	
	@Test
	public void testTipoDApos30DiasAte120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento agendamento = new Agendamento(new BigDecimal("100000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("8")) == 0);
	}
	
	// A
	@Test
	public void testTipoDAte5DiasAte25mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento agendamento = new Agendamento(new BigDecimal("20000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("602")) == 0);
	}
	
	@Test
	public void testTipoDApos30DiasAte25mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento agendamento = new Agendamento(new BigDecimal("20000"), data, TipoTransferencia.D);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("602")) == 0);
	}

}
