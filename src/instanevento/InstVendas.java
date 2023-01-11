package instanevento;

import evento.Ingresso;

public class InstVendas {

	public static void main(String[] args) {
		Ingresso i1 = new Ingresso();		
		i1.setDataAqui("01/10/2022");
		i1.setFormaPag("PIX");
		
		Ingresso i2 = new Ingresso();
		i2.setDataAqui("02/10/2022");
		i2.setFormaPag("Débito");
		
		Ingresso i3 = new Ingresso();
		i3.setDataAqui("05/10/2022");
		i3.setFormaPag("Crédito");
		
		Ingresso i4 = new Ingresso();
		i4.setDataAqui("20/10/2022");
		i4.setFormaPag("Boleto");
		
		Ingresso i5 = new Ingresso();
		i5.setDataAqui("29/10/2022");
		i5.setFormaPag("PIX");
	}

}
