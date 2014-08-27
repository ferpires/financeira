import java.math.BigDecimal;


public interface DataAgendamento {

	BigDecimal calculoData(Agendamento agendamento);
	void setBuscaDataValida(DataAgendamento dataAgendamento);
}
