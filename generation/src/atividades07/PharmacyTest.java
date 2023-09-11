package atividades07;

public class PharmacyTest {

	public static void main(String[] args) {
		
		Pharmacy f1 = new Pharmacy("Drogaria Boa Saúde", "Rua dos Viajantes", 145, "São Paulo", "089827823");
		Pharmacy f2 = new Pharmacy("Drogaria São Paulo", "Av. São Francisco de Assis", 2941, "São Paulo", "08189555");
		
		f1.view();
		System.out.println("=======================================================================================");
		f2.view();

	}

}
