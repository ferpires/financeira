
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
		Agendamento c1 = new Agendamento(100, data, "C");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(1.2, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoCAte30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 29);
		Agendamento c1 = new Agendamento(100, data, "C");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(2.1, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoCAte25Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 24);
		Agendamento c1 = new Agendamento(100, data, "C");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(4.3, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoCAte20Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 19);
		Agendamento c1 = new Agendamento(100, data, "C");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(5.4, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoCAte15Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 14);
		Agendamento c1 = new Agendamento(100, data, "C");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(6.7, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoCAte10Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 9);
		Agendamento c1 = new Agendamento(100, data, "C");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(7.4, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoCAte5Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento c1 = new Agendamento(100, data, "C");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(8.3, valorC1, 0.00001);
	}

}
