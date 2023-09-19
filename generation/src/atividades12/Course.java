package atividades12;

import java.util.List;

public class Course {
	
	private String name;
	private String duration;
	private String level;
	private List teachers;
	private float price;
	
	public Course(String name, String duration, String level, List teachers, float price) {
		this.name = name;
		this.duration = duration;
		this.level = level;
		this.teachers = teachers;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public List getTeachers() {
		return teachers;
	}

	public void setTeachers(List teachers) {
		this.teachers = teachers;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void view() {
		System.out.printf("Nome do Curso: %s\nDuração: %s\nNível: %s\nProfessores: %s\nPreço: %.2f\n", getName(), getDuration(), getLevel(), getTeachers(), getPrice());
		System.out.println("================================================================");
	}
	
	
}
