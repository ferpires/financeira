import java.math.BigDecimal;
import java.util.Calendar;


public class Agendamento {

	private String contaOrigem;
	private String contaDestino;
	private BigDecimal valorTransferencia;
	private Calendar dataAgendamento;
	private TipoTransferencia tipoTransferencia;
	
	public Agendamento (BigDecimal valorTransferencia, Calendar dataAgendamento, TipoTransferencia tipoTransferencia){
		this.valorTransferencia = valorTransferencia;
		this.dataAgendamento = dataAgendamento;
		this.tipoTransferencia = tipoTransferencia;
	}
	
	public String getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(String contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public String getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(String contaDestino) {
		this.contaDestino = contaDestino;
	}

	public BigDecimal getValorTransferencia() {
		return valorTransferencia;
	}
	
	public Calendar getDataAgendamento() {
		return dataAgendamento;
	}

	public TipoTransferencia getTipoTransferencia() {
		return tipoTransferencia;
	}

	public void setTipoTransferencia(TipoTransferencia tipoTransferencia) {
		this.tipoTransferencia = tipoTransferencia;
	}
	
	public BigDecimal calculaValorTotalTransacao(Agendamento agendamento, CalculaTaxaPorOperacao calculaTaxaPorOperacao) {
		return agendamento.getValorTransferencia().add(calculaTaxaPorOperacao.taxa(agendamento));
	}
}
