package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1"); //순서대로 요소를 추가
		shelfQueue.enQueue("태백산맥 2"); //순서대로 요소를 추가
		shelfQueue.enQueue("태백산맥 3"); //순서대로 요소를 추가
		
		System.out.println(shelfQueue.deQueue()); //입력순서대로 요소를 꺼내서 출력
		System.out.println(shelfQueue.deQueue()); //입력순서대로 요소를 꺼내서 출력
		System.out.println(shelfQueue.deQueue()); //입력순서대로 요소를 꺼내서 출력
	}
}