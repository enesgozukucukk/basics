package schoolmanagement;
//This class is responsible for keep the track of students
//Track of student name , grade and fees paid
public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	/*
	 * This class is responsible for keeping the
	 * track of students fees, name ,grade & fees
	 * paid.
	 *
	 */
	public Student(int id, String name, int grade) {
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}

	
	public void payFees(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}

	public int getGrade() {
		return grade;
	}
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	public String toString() {
		return "Student's name : "+name+
				" Total fees paid so far $"+ feesPaid;
	}	
}
