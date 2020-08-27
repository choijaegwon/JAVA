package interfaceex;

public interface Calc {
	double PI = 3.14; //인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	int ERROR = -999999999; //인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	
	int add(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int substract(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int times(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int diveide(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다."); //디폴트 메서드 구현하기
		myMethod(); //디폴트 메서드에서 private 메서드 호출
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod( ); //정적 메서드에서 private static메서드 호출
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
	
	private static void myStaticMethod( ) {
		System.out.println("private static 메서드 입니다.");
	}
}