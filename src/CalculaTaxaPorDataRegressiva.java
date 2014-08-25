
public class CalculaTaxaPorDataRegressiva {
	
	public double validaData(Agendamento a){
		
		MaiorQueTrintaDias maiorQueTrintaDias = new MaiorQueTrintaDias();
		AteCincoDias ateCincoDias = new AteCincoDias();
		AteDezDias ateDezDias = new AteDezDias();
		AteQuinzeDias ateQuinzeDias = new AteQuinzeDias();
		AteVinteDias ateVinteDias = new AteVinteDias();
		AteVinteECincoDias ateVinteECincoDias = new AteVinteECincoDias();
		AteTrintaDias ateTrintaDias = new AteTrintaDias();
		
		maiorQueTrintaDias.setBuscaDataValida(ateCincoDias);
		ateCincoDias.setBuscaDataValida(ateDezDias);
		ateDezDias.setBuscaDataValida(ateQuinzeDias);
		ateQuinzeDias.setBuscaDataValida(ateVinteDias);
		ateVinteDias.setBuscaDataValida(ateVinteECincoDias);
		ateVinteECincoDias.setBuscaDataValida(ateTrintaDias);
		
		return maiorQueTrintaDias.calculoData(a);
	}
}
