package atividades12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseTest {

	public static void main(String[] args) {
		
		List teachers = new ArrayList();
		teachers.add("Elizangela");
		teachers.add("Tatiana");
		teachers.add("Tochichico");
		
		Course c1 = new Course("História do Brasil", "360h", "Básico", teachers, 800.00f);
		Course c2 = new Course("História da Matemática", "360h", "Avançado", teachers, 600.00f);
		
		/*c1.view();
		c2.view();*/
		
		List<Course> course = Arrays.asList(c1, c2);
		//course.forEach(c -> System.out.println(c.getLevel()));
		
		List<Course> stream = course.stream().filter(c -> c.getLevel().equals("Básico")).collect(Collectors.toList());
		
		System.out.println(stream);
				
	}
}
