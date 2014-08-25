
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
		Agendamento c1 = new Agendamento(200000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(2400, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoDAte30DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 30);
		Agendamento c1 = new Agendamento(200000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(4200, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoDAte25DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 24);
		Agendamento c1 = new Agendamento(200000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(8600, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoDAte20DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 19);
		Agendamento c1 = new Agendamento(200000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(10800, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoDAte15DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 14);
		Agendamento c1 = new Agendamento(200000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(13400, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoDAte10DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 9);
		Agendamento c1 = new Agendamento(200000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(14800, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoDAte5DiasMaior120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento c1 = new Agendamento(200000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(16600, valorC1, 0.00001);
	}
	
	// B
	@Test
	public void testTipoDAte5DiasAte120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento c1 = new Agendamento(100000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(10, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoDApos30DiasAte120mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento c1 = new Agendamento(100000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(8, valorC1, 0.00001);
	}
	
	// A
	@Test
	public void testTipoDAte5DiasAte25mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 4);
		Agendamento c1 = new Agendamento(20000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(602, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoDApos30DiasAte25mil() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento c1 = new Agendamento(200000, data, "D");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(2400, valorC1, 0.00001);
	}

}
