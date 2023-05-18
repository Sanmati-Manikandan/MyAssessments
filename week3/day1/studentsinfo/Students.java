package week3.day1.studentsinfo;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("The student's id is " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("--------------------------");
		System.out.println("The student's id is " + id);
		System.out.println("The Student's name is " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("--------------------------");
		System.out.println("The student's email is " + email);
		System.out.println("The student's phone number is " + phoneNumber);
	}

	public static void main(String[] args) {

		Students students = new Students();
		students.getStudentInfo(15265);
		students.getStudentInfo(54549, "Manikandan");
		students.getStudentInfo("abc@gmail.com", 1234567890L);

	}

}
