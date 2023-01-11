package evento;

public class Lote {
	private Integer ingresso;
	private Integer valorLote;
	private String dataInicio;
	private String dataFinal;
	
	public Lote() {
		
	}

	public Lote(Integer ingresso, Integer valorLote, String dataInicio, String dataFinal) {
		this.ingresso = ingresso;
		this.valorLote = valorLote;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;

	}

	public Integer getIngresso() {
		return ingresso;
	}

	public void setIngresso(Integer ingresso) {
		this.ingresso = ingresso;
	}

	public Integer getValorLote() {
		return valorLote;
	}

	public void setValorLote(Integer valorLote) {
		this.valorLote = valorLote;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	
	
	
	
	
}
