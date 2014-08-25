
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;


public class AgendamentoTest {

	Calendar data = GregorianCalendar.getInstance();
	CalculaTaxaPorOperacao calculaTaxa = new CalculaTaxaPorOperacao();
	
	@Test
	public void novoAgendamentoTipoA() {
		Agendamento a = new Agendamento(100, Calendar.getInstance(), "A");
		double valor = calculaTaxa.taxa(a);
		Assert.assertEquals(5, valor, 0.00001);
	}
	
	@Test
	public void AgendamentoTipoBAteTrintaDias() {
		Agendamento a = new Agendamento(100, new GregorianCalendar(2014, 6, 24), "B");
		double valor = calculaTaxa.taxa(a);
		Assert.assertEquals(10, valor, 0.00001);
	}
	
	@Test
	public void testTipoAValorTotalTransacao() {
		Agendamento c1 = new Agendamento(1600, data, "A");
		Assert.assertEquals(1650, c1.calculaValorTotalTransacao(c1, calculaTaxa), 0.00001);
	}
	
	@Test
	public void testTipoBValorTotalAte30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 20);
		Agendamento c1 = new Agendamento(100, data, "B");
		Assert.assertEquals(110, c1.calculaValorTotalTransacao(c1, calculaTaxa), 0.00001);
	}
	
	@Test
	public void testTipoBValorTotalApos30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento c1 = new Agendamento(100, data, "B");
		Assert.assertEquals(108, c1.calculaValorTotalTransacao(c1, calculaTaxa), 0.00001);
	}
	
	@Test
	public void testTipoCValorTotalApos30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento c1 = new Agendamento(100, data, "C");
		Assert.assertEquals(101.2, c1.calculaValorTotalTransacao(c1, calculaTaxa), 0.00001);
	}
	
	@Test
	public void testTipoCValorTotalAte5Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento c1 = new Agendamento(100, data, "C");
		Assert.assertEquals(108.3, c1.calculaValorTotalTransacao(c1, calculaTaxa), 0.00001);
	}

}
