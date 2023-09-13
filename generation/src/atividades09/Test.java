package atividades09;

public class Test {

	public static void main(String[] args) {
		
		

		Ticket t1 = new Ticket();
		
		t1.setName("O Auto da Compadecida");
		t1.setCategory("Filme");
		t1.setDescription("Baseado na obra de Ariano Suassuna, o filme narra as aventuras de João Grilo, um sertanejo pobre e mentiroso, e Chicó, "
				+ "o mais covarde dos homens. Eles vivem trapaceando no pequeno vilarejo de Taperoá, sertão da Paraíba. Somente a aparição da Nossa "
				+ "Senhora pode salvar a dupla.");
		t1.setQuantityStock(350);
		t1.setPrice(55.00f);
		t1.setDate("26.09.2003");
		t1.setTime("16:00");
		t1.setLocal("Rua dos Limoeiros - São Paulo/SP");
		t1.setStatus("Concluído");

		t1.view();
		t1.buy(6);
		t1.view();
	}

}
