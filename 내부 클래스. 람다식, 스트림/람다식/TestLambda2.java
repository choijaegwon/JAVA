package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda2 {
	public static void main(String[] args) {
		PrintString lambdaStr = s->System.out.println(s);  //람다식을 변수에 대입
		lambdaStr.showString("hello lambda_1");		
		showMyString(lambdaStr);                          //메서드 매개변수로 전달
	}	
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
}