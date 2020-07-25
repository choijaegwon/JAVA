package array;

public class BookArray2 {
	public static void main(String[] args) {
		Book[ ] library = new Book
				[5];
		
		library[0] = new Book("태백산맥", "조정래"); //인스턴스 생성후 배열에 저장
		library[1] = new Book("데미안", "헤르만 허세"); //인스턴스 생성후 배열에 저장
		library[2] = new Book("어떻게 살 것인가", "유시민"); //인스턴스 생성후 배열에 저장
		library[3] = new Book("토지", "박경리"); //인스턴스 생성후 배열에 저장
		library[4] = new Book("어린왕자", "생텍쥐페리"); //인스턴스 생성후 배열에 저장
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}