package schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher esref= new Teacher(1,"Esref",500);
		Teacher hasan= new Teacher(2,"Hasan",700);
		Teacher bertan= new Teacher(3,"Bertan	",600);
		List<Teacher> teacherList = new ArrayList<>(); 
		
		 	Student tuna = new Student(1,"Tuna",4);
	        Student yunus = new Student(2,"Yunus",12);
	        Student berk = new Student(3,"Berk",5);
	        List<Student> studentList = new ArrayList<>();
	        studentList.add(tuna);
	        studentList.add(yunus);
	        studentList.add(berk);
	        School ghs = new School(teacherList,studentList);
	        
	        
	       
	       
	        tuna.payFees(5000);
	        yunus.payFees(6000);
	        System.out.println("GHS has earned "+ghs.getTotalMoneyEarned());
	        System.out.println("-----Making School Pay Salary");
	        esref.receiveSalary(esref.getSalary());
	        System.out.println("GHS has spent "+esref.getSalary()+"$ salary to "+esref.getName()+" and now has $" +ghs.getTotalMoneyEarned());
	        hasan.receiveSalary(hasan.getSalary());
	        System.out.println("GHS has spent "+hasan.getSalary()+"$ salary to "+hasan.getName()+" and now has $" +ghs.getTotalMoneyEarned());
	        
	        bertan.receiveSalary(bertan.getSalary());	       
	        System.out.println("GHS has spent "+bertan.getSalary() +"$ salary to "+bertan.getName()+" and now has $" +ghs.getTotalMoneyEarned());
	        System.out.println(esref);
	        System.out.println(hasan);
	        System.out.println(bertan);
	}

}
