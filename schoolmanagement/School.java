package schoolmanagement;

import java.util.List;

public class School {
	
	private List<Teacher> teacher;
	private List<Student> student;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	private static int balance;
	public School(List<Teacher> teacher, List<Student> student) {
		super();
		this.teacher = teacher;
		this.student = student;
		this.totalMoneyEarned=0;
		this.totalMoneySpent=0;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void addTeacher(Teacher teachers) {
		teacher.add(teachers);
	}
	public List<Student> getStudent() {
		return student;
	}
	public void addStudent(Student students) {
		student.add(students); 
	}
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned -= MoneySpent;
	}
	
	
	
}
