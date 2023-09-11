package atividades07;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("Sophia", "R. Araújo", "20/05/2000", 98412577489l, "Design");
		Employee e2 = new Employee("Rodrigo", "Cardoso Gonçalves", "03/12/1999", 47821358101l, "Design");
	
		e1.view();
		System.out.println("======================================");
		e2.view();
	}

}
