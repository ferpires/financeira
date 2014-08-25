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
		Agendamento c1 = new Agendamento(100000, data, "B");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(10, valorC1, 0.00001);
	}
	
	@Test
	public void testTipoDApos30Dias() {
		data.add(GregorianCalendar.DAY_OF_MONTH, 40);
		Agendamento c1 = new Agendamento(100000, data, "B");
		double valorC1 = calculaTaxa.taxa(c1);
		Assert.assertEquals(8, valorC1, 0.00001);
	}

}
