package interfaceex;

public interface Calc {
	double PI = 3.14; //인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	int ERROR = -999999999; //인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	
	int add(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int substract(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int times(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int diveide(int num1, int num2); //인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
}