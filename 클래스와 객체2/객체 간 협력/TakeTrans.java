package cooperation;

public class TakeTrans {
	public static void main(String[] argw) {
		Student studentJames = new Student("james", 5000); //학생 두명 생성
		Student studentTomas = new Student("Tomas", 10000); //학생 두명 생성
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}

}
