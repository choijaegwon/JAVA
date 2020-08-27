package classpart;

public class StudentTest1 {
	public static void main(String[] args) {
		Student3 student1 = new Student3( ); //첫 번쨰 학생 생성
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		Student3 student2 = new Student3( ); //두 번째 학생 생성
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}
}