package object;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){ //책 번호와 제목을 매개변수로 입력받는 생성자
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

@Override
public String toString() { //toString()메서드 재정의
	return bookTitle+ "," + bookNumber; 
	}
}

public class TostingEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);//인스턴스 정보(클래스 이름.주소값)
		System.out.println(book1.toString()); //toString()메서드로 인스턴스 정보 (클래스 이름. 주소 값)를 보여줌
	}
}