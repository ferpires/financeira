import java.math.BigDecimal;


public interface Taxa {

	BigDecimal calculoTaxa(Agendamento agendamento);
	void setBuscaTaxaValida(Taxa taxa);
	
}
