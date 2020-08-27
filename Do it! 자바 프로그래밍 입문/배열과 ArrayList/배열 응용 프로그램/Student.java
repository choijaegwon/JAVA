package array;
import java.util.ArrayList;

public class Student { 
	int studentID;  //Student 클래스의 멤버 변수
	String studentName;  //Student 클래스의 멤버 변수
	ArrayList<Subject> subjectList; //ArrayList 선언하기, Student 클래스의 멤버 변수
	
	public Student(int studentID, String studentName) { //생성자
		this.studentID = studentID; //생성자
		this.studentName = studentName; //생성자
		subjectList = new ArrayList<Subject>( ); //ArrayList 생성하기, 생성자
	}
	
	public void addSubject(String name, int score) { //학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
		Subject subject = new Subject( ); //Subject 생성하기 ,학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
		subject.setName(name); //과목 이름 추가하기 ,학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
		subject.setScorePoint(score); //점수 추가하기 ,학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
		subjectList.add(subject); //배열에 저장하기 ,학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
	}
	
	public void showStudentInfo( ) {
		int total = 0;
		for(Subject s : subjectList) { //배열 소요 값 출력
			total += s.getScorePoint( ); //총점 더하기 ,배열 소요 값 출력
			System.out.println("학생 "+ studentName + "의" + s.getName( )+ "과목 성적은"+s.getScorePoint( ) + "입니다,"); //배열 소요 값 출력
		}
			System.out.println("학생" + studentName +"의 총점은" + total+ "입니다.");
	}
}