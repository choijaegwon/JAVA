package cooperation;

public class TakeTrans {
	public static void main(String[] argw) {
		Student studentJames = new Student("james", 5000); //학생 두명 생성
		Student studentTomas = new Student("Tomas", 10000); //학생 두명 생성
		
		Bus bus100 = new Bus(100); //노선 번호가 100번인 버스생성
		studentJames.takeBus(bus100); //james가 100번 버스를 탐
		studentJames.showInfo(); //james 정보 출력
		bus100.showInfo(); //버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선"); //노선 번호가 2호선인 지하철 생성
		studentTomas.takeSubway(subwayGreen); //tomas가 2호선을탐
		studentTomas.showInfo(); //tomas 정보 출력
		subwayGreen.showInfo(); //지하철 정보 출력
	}

}
