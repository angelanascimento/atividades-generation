package atividades11;

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
		Course c2 = new Course("História da Matemática", "360h", "Básico", teachers, 800.00f);
		
		c1.view();
		c2.view();
		
		Optional<Course> courseOptional = Optional.of(c1);

		courseOptional.map(resposta -> resposta.getName())
			.filter(courseName -> courseName.startsWith("E"))
			.orElseThrow(() -> new RuntimeException("O curso não foi localizado"));
		
		System.out.println("Nome do Curso: " + courseOptional.get().getName());
				
	}
}
