package instanevento;

import evento.Lote;

public class InstLote {

	public static void main(String[] args) {
		
		Lote lote1 = new Lote();
		lote1.setIngresso(100);
		lote1.setValorLote(40);
		lote1.setDataInicio("01/10/2022");
		lote1.setDataFinal("10/10/2022");
		
		
		Lote lote2 = new Lote();
		lote2.setIngresso(150);
		lote2.setValorLote(80);
		lote2.setDataInicio("11/10/2022");
		lote2.setDataFinal("30/10/2022");
		
		System.out.println("Evento de colação: Lote 1: " + lote1.getDataInicio() + ". Com valor de R$: "+ lote1.getValorLote() );
		
		System.out.println("Evento de colação: Lote 1: " + lote2.getDataInicio() + ". Com valor de R$: "+ lote2.getValorLote() );
	}

}
