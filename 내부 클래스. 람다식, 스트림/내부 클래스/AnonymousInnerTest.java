package innerclass;

class Outter2{		
	Runnable getRunnable(int i){
		int num = 100;
		
		return new Runnable() { //익명 내부 클래스/Runnabel 인터페이스 생성
		@Override
		public void run() {
			//num = 200;   //에러 남
			//i = 10;      //에러 남
			System.out.println(i);
			System.out.println(num);
			}
		}; //클래스 끝에 ; 를 씀
	}
	
	Runnable runner = new Runnable() { //익명 내부 클래스를 변수에 대입
		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
		}
	}; //클래스 끝에 ; fmf Tma
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outter2 out = new Outter2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		out.runner.run();
	}
}
