
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;


public class AgendamentoTest {

	Calendar data = GregorianCalendar.getInstance();
	CalculaTaxaPorOperacao calculaTaxa = new CalculaTaxaPorOperacao();
	
	@Test
	public void novoAgendamentoTipoA() {
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), Calendar.getInstance(), TipoTransferencia.A);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("5")) == 0);
	}
	
	@Test
	public void AgendamentoTipoBAteTrintaDias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 20);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.B);
		BigDecimal valorTaxa = calculaTaxa.taxa(agendamento);
		Assert.assertTrue(valorTaxa.compareTo(new BigDecimal("10")) == 0);
	}
	
	@Test
	public void testTipoAValorTotalTransacao() {
		Agendamento agendamento = new Agendamento(new BigDecimal("1600"), data, TipoTransferencia.A);
		Assert.assertTrue(agendamento.calculaValorTotalTransacao(agendamento, calculaTaxa).compareTo(new BigDecimal("1650")) == 0);
	}
	
	@Test
	public void testTipoBValorTotalAte30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 20);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.B);
		Assert.assertTrue(agendamento.calculaValorTotalTransacao(agendamento, calculaTaxa).compareTo(new BigDecimal("110")) == 0);
	}
	
	@Test
	public void testTipoBValorTotalApos30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.B);
		Assert.assertTrue(agendamento.calculaValorTotalTransacao(agendamento, calculaTaxa).compareTo(new BigDecimal("108")) == 0);
	}
	
	@Test
	public void testTipoCValorTotalApos30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.C);
		Assert.assertTrue(agendamento.calculaValorTotalTransacao(agendamento, calculaTaxa).compareTo(new BigDecimal("101.2")) == 0);
	}
	
	@Test
	public void testTipoCValorTotalAte5Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento agendamento = new Agendamento(new BigDecimal("100"), data, TipoTransferencia.C);
		Assert.assertTrue(agendamento.calculaValorTotalTransacao(agendamento, calculaTaxa).compareTo(new BigDecimal("108.3")) == 0);
	}

}
