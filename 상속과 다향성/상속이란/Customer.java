package inheritance;

public class Customer {
	private int customerID; //고객 아이디, 멤버 변수
	private String customerName; //고객 이름, 멤버 변수
	private String customerGrade; //고객 등급, 멤버 변수
	int bonusPoint; //보너스 포인트, 멤버 변수
	double bonusRatio; //적립 비율 , 멤버 변수
	
	public Customer() {
		customerGrade = "SILVER"; //기본등급, 디폴트 생성자
		bonusRatio = 0.01; //보너스 포인트 기본 적립 비율, 디폴트 생성자
	}
	
	public int calcPrice(int price) { //보너스 포인트 적립, 지불 가격 계산 메서드
		bonusPoint += price * bonusRatio; //보너스 포인트 계산
		return price;
	}
	
	public String showCustomerInfo( ) {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다,";
	}
}