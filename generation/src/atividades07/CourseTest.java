package atividades07;

import java.util.ArrayList;
import java.util.List;

public class CourseTest {

	public static void main(String[] args) {
		
		List teachers = new ArrayList();
		teachers.add("Elizangela");
		teachers.add("Tatiana");
		teachers.add("Tochichico");
		
		Course c1 = new Course("História do Brasil", "360h", "Básico", teachers, 800.00f);
		Course c2 = new Course("História da Matemática", "360h", "Básico", teachers, 800.00f);
		
		c1.view();
		c2.view();
	}
}
