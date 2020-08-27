package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이지원"); //새로운 회원 인스턴스 생성
		Member memberSon = new Member(1002, "손민국"); //새로운 회원 인스턴스 생성
		Member memberPark = new Member(1003, "박서훤"); //새로운 회원 인스턴스 생성
		Member memberHong = new Member(1004, "홍길동"); //새로운 회원 인스턴스 생성
		
		memberArrayList.addMember(memberLee); //ArrayLis에 회원 추가
		memberArrayList.addMember(memberSon); //ArrayLis에 회원 추가
		memberArrayList.addMember(memberPark); //ArrayLis에 회원 추가
		memberArrayList.addMember(memberHong); //ArrayLis에 회원 추가
		
		memberArrayList.showAllMember(); //전체 회원 출력
		
		memberArrayList.removeMember(memberHong.getMemberId()); //홍길동 회원 삭제
		memberArrayList.showAllMember(); //홍길동 회원을 삭제한 후 다시 전체 출력
	}
}
