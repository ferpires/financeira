import java.util.Calendar;


public class Agendamento {

	private String contaOrigem;
	private String contaDestino;
	private double valorTransferencia;
	private Calendar dataAgendamento;
	private String tipoTransferencia;
	
	public Agendamento (double valorTransferencia, Calendar dataAgendamento, String tipoTransferencia){
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

	public double getValorTransferencia() {
		return valorTransferencia;
	}
	
	public Calendar getDataAgendamento() {
		return dataAgendamento;
	}

	public String getTipoTransferencia() {
		return tipoTransferencia;
	}

	public void setTipoTransferencia(String tipoTransferencia) {
		this.tipoTransferencia = tipoTransferencia;
	}
	
	public double calculaValorTotalTransacao(Agendamento a, CalculaTaxaPorOperacao c) {
		return a.getValorTransferencia() + c.taxa(a);
	}
}
