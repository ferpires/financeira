import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;


public class OperacaoTipoATest {

	Calendar data = GregorianCalendar.getInstance();
	CalculaTaxaPorOperacao calculaTaxa = new CalculaTaxaPorOperacao();
	
	@Test
	public void testTipoA100Reais() {
		Agendamento c1 = new Agendamento(100, data, "A");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(5, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoA200Reais() {
		Agendamento c1 = new Agendamento(200, data, "A");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(8, valorC1, 0.00001);
	}

	@Test
	public void testTipoA1600Reais() {
		Agendamento c1 = new Agendamento(1600, data, "A");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(50, valorC1, 0.00001);
	}
	
}
