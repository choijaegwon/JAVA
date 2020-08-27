public class ForExampel1 {
	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i <=10; i++) {
			sum += i; //i는 주로 횟수를 표현한다.
		}
		
		System.out.println("1부터 10까지의 합은"+ sum + "입니다.");
	}
}
